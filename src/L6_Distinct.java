import java.util.Arrays;

public class L6_Distinct
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{2, 1, 2, 2, 3, 1}) + " expected 3");
		System.out.println("got " + solution(new int[]{1, 1, 1}) + " expected 1");
	}

	public static int solution(int[] A) {
		int distinctCount = 0;

		Arrays.sort(A);

		for(int i=0;i<A.length;i++){
			if(i==0){
				distinctCount++;
				continue;
			}

			if(A[i] != A[i-1]){
				distinctCount++;
			}
		}

		return distinctCount;
	}
}
