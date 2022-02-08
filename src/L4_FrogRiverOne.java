public class L4_FrogRiverOne
{
	public static void main(String[] args) {
		int[] a = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println("got " + solution(5, a) + " expected 6");
	}

	public static int solution(int X, int[] A) {
		int[]B = new int[X+1];
		int sum = getSum(X);

		for(int i = 0; i < A.length; i++) {
			if(A[i] <= X && B[A[i]] == 0){
				B[A[i]] = 1;
				sum -= A[i];
			}

			if(sum == 0){
				return i;
			}
		}

		return -1;
	}

	private static int getSum(int X) {
		int sum = 0;

		for(int i = 1; i<=X;i++){
			sum+=i;
		}
		return sum;
	}
}
