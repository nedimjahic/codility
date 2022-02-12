import java.util.Arrays;

public class L6_MaxProductOfThree
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{-10, -2, -4}) + " expected -80");
		System.out.println("got " + solution(new int[]{-3, 1, 2, -2, 5, 6}) + " expected 60");
	}

	public static int solution(int[] A) {
		Arrays.sort(A);
		int len = A.length;

		int product1 = A[len-1]*A[len-2]*A[len-3];
		int product2 = A[0]*A[1]*A[len-1];

		int maxProduct = Math.max(product1, product2);

		return maxProduct;
	}
}
