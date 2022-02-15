import java.util.ArrayDeque;
import java.util.Deque;

public class L7_Fish
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}) + " expected 2");
		System.out.println("got " + solution(new int[]{1, 2, 3, 4, 5}, new int[]{0, 0, 0, 0, 1}) + " expected 5");
	}

	public static int solution(int[] A, int[] B) {
		Deque<Integer> upstream = new ArrayDeque<>();
		int downstreamCount = 0;

		for(int i=A.length-1;i>=0;i--){
			if(B[i] == 0){
				upstream.push(A[i]);
			} else {
				if(upstream.isEmpty()){
					downstreamCount++;
				} else {
					if(A[i]<upstream.peek()){
						//System.out.println("Downstream " + A[i] + " eaten by " + upstream.peek());
						continue;
					} else {
						boolean bigger = true;
						while(bigger && !upstream.isEmpty()){
							if(A[i]>upstream.peek()){
								//System.out.println("Downstream " + A[i] + " bigger than " + upstream.peek());
								upstream.pop();
							} else {
								bigger = false;
							}
						}
						if(bigger){
							//System.out.println("Adding to downstream after eating all " + A[i]);
							downstreamCount++;
						}
					}
				}

			}
		}

		return upstream.size() + downstreamCount;
	}
}
