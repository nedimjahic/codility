import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class L7_Brackets
{
	public static void main(String[] args) {
		System.out.println("got " + solution("{[()()]}") + " expected 1");
		System.out.println("got " + solution("([)()]") + " expected 0");
		System.out.println("got " + solution(")(") + " expected 0");
	}

	public static int solution(String S) {
		int res = 1;
		Deque<Character> stack = new ArrayDeque<>();

		for(Character ch : S.toCharArray()){
			if(stack.isEmpty()){
				if(ch == ')' || ch == ']' || ch == '}'){
					return 0;
				}
				stack.push(ch);
				continue;
			}

			if(ch == ')'){
				if(stack.peek() != '('){
					return 0;
				}
				stack.pop();
			} else if(ch == ']'){
				if(stack.peek() != '['){
					return 0;
				}
				stack.pop();
			} else if(ch == '}'){
				if(stack.peek() != '{'){
					return 0;
				}
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		return stack.isEmpty() ? res : 0;
	}
}
