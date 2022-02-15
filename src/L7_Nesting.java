import java.util.ArrayDeque;
import java.util.Deque;

public class L7_Nesting
{
	public static void main(String[] args) {
		System.out.println("got " + solution("(()(())())") + " expected 1");
		System.out.println("got " + solution("())") + " expected 0");
		System.out.println("got " + solution(")(") + " expected 0");
	}

	public static int solution(String S) {
		int res = 1;

		Deque<Character> stack = new ArrayDeque<>();

		for(Character ch : S.toCharArray()){
			if(ch == ')'){
				if(stack.isEmpty() || stack.pop() != '('){
					return 0;
				}
			} else {
				stack.push(ch);
			}
		}


		return stack.isEmpty() ? 1 : 0;
	}
}
