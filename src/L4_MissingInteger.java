import java.util.Arrays;

public class L4_MissingInteger
{
	public static void main(String[] args) {
		int[] a = {1, 3, 6, 4, 1, 2};
		int[] b = {};
		int[] c = {1, 2, 3, 4};
		System.out.println("got " + solution(a) + " expected 5");
		System.out.println("got " + solution(b) + " expected 1");
		System.out.println("got " + solution(c) + " expected 5");
	}

	public static int solution(int[] A) {
		Arrays.sort(A);
		int expected = 1;
		for(int i=0;i<A.length;i++){
			if(A[i]<1 || (i>0 && A[i] == A[i-1])){
				continue;
			}

			if(A[i] != expected){
				return expected;
			}

			expected++;
		}

		return expected;
	}
}
