import java.util.Arrays;

public class L4_PermCheck
{
	public static void main(String[] args) {
		int[] a = {4, 1, 3, 2};
		int[] b = {4, 1, 3};
		System.out.println("got " + solution(a) + " expected 1");
		System.out.println("got " + solution(b) + " expected 0");
	}

	public static int solution(int[] A) {
		Arrays.sort(A);
		int element = 1;

		for(int i=0;i<A.length;i++){
			if(A[i] == element){
				element++;
			} else {
				return 0;
			}
		}

		return 1;
	}
}
