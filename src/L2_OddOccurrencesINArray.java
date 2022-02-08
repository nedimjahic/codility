import java.util.Arrays;

public class L2_OddOccurrencesINArray
{
	public static void main(String[] args) {
		int[] a = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("got " + solution(a) + " expected 7");
	}

	public static int solution(int[] A) {
		if(A.length == 1){
			return A[0];
		}
		int unpaired = -1;
		Arrays.sort(A);

		for(int i=0;i<A.length;i+=2){
			if(i == A.length-1){
				unpaired = A[i];
				break;
			}
			if(A[i] != A[i+1]){
				unpaired = A[i];
				break;
			}
		}

		return unpaired;
	}
}
