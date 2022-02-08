public class L3_TapeEquilibrium
{
	public static void main(String[] args) {
		int[] a = {3, 1, 2, 4, 3};
		System.out.println("got " + solution(a) + " expected 1");
	}

	public static int solution(int[] A) {
		int minDiff = Integer.MAX_VALUE;
		int[]B = new int[A.length];
		int[]C = new int[A.length];

		for(int i = 0; i < A.length; i++) {
			if(i==0){
				B[i] = A[i];
			} else {
				B[i] = B[i-1] + A[i];
			}
		}

		for(int i = A.length - 1; i >= 0; i--) {
			if(i==A.length - 1) {
				C[i] = A[i];
			} else {
				C[i] = C[i+1] + A[i];
			}
		}

		for(int i = 1; i < A.length; i++) {
			int diff = Math.abs(B[i-1] - C[i]);
			if(diff < minDiff){
				minDiff = diff;
			}
		}

		return minDiff;
	}
}
