import java.util.Arrays;

public class L3_PermMissingElem
{
	public static void main(String[] args) {
		int[] a = {2, 3, 1, 5};
		int[] b = {};
		System.out.println("got " + solution(a) + " expected 4");
		System.out.println("got " + solution(b) + " expected 1");
	}

	public static int solution(int[] A) {
		int num = 1;

		Arrays.sort(A);

		for(int i = 0; i < A.length; i++){
			if(A[i] != num){
				return num;
			} else {
				num++;
			}
		}

		return num;
	}
}
