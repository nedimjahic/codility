import java.util.Arrays;

public class L2_CyclicRotation
{
	public static void main(String[] args) {
		int[] a = {3, 8, 9, 7, 6};
		int[] b = {0, 0, 0};
		int[] c = {1, 2, 3, 4};
		System.out.println("got " + Arrays.toString(solution(a, 3)) + " expected [9, 7, 6, 3, 8]");
		System.out.println("got " + Arrays.toString(solution(b, 1)) + " expected [0, 0, 0]");
		System.out.println("got " + Arrays.toString(solution(c, 4)) + " expected [1, 2, 3, 4]");
	}

	public static int[] solution(int[] A, int K) {
		int len = A.length;

		if(len == 0){
			return A;
		}

		int[] B = new int[len];

		if(K > len) {
			K = K % len;
		}

		for(int i = 0; i < len; i++) {
			int index = i + K >= len ? i + K - len : i + K;
			B[index] = A[i];
		}

		return B;
	}
}
