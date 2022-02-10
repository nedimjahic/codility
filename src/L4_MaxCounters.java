import java.util.Arrays;

public class L4_MaxCounters
{
	public static void main(String[] args) {
		int[] a = {3, 4, 4, 6, 1, 4, 4};
		System.out.println("got " + Arrays.toString(solution(5, a)) + " expected [3, 2, 2, 4, 2]");
	}

	public static int[] solution(int N, int[] A) {
		int[] C = new int[N];
		int maxCounter = 0;
		int lastAppliedCounter = 0;

		for(int i = 0; i < A.length; i++) {
			if(A[i] <= N) {
				int cIndex = A[i] - 1;
				if(C[cIndex] < lastAppliedCounter){
					C[cIndex] = lastAppliedCounter + 1;
				} else {
					C[cIndex]++;
				}

				if(C[cIndex] > maxCounter){
					maxCounter = C[cIndex];
				}
			} else {
				lastAppliedCounter = maxCounter;
			}
		}

		for(int i = 0; i < C.length; i++) {
			if(C[i] < lastAppliedCounter){
				C[i] = lastAppliedCounter;
			}
		}

		return C;
	}
}
