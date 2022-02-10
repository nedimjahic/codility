import java.util.Arrays;

public class L5_PassingCars
{
	public static void main(String[] args) {
		int[] a = {0, 1, 0, 1, 1};
		int[] b = {1, 0, 0, 0, 0};
		int[] c = {1, 1, 1, 1, 0};
		System.out.println("got " + solution(a) + " expected 5");
		System.out.println("got " + solution(b) + " expected 0");
		System.out.println("got " + solution(c) + " expected 0");
	}

	public static int solution(int[] A) {
		int pairs = 0;
		int[] suffixSum = new int[A.length];

		int count = 0;
		for(int i=A.length-1;i>=0;i--){
			if(A[i] == 1){
				suffixSum[i] = ++count;
			} else {
				suffixSum[i] = count;
			}
		}

		for(int i=0;i<A.length;i++){
			if(A[i] == 0){
				pairs += suffixSum[i];
			}

			if(pairs > 1_000_000_000){
				return -1;
			}
		}

		return pairs;
	}
}
