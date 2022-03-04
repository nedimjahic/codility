import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TODO 66%->100%
public class L11_CountNonDivisible
{
	public static void main(String[] args) {
		System.out.println("got " + Arrays.toString(solution(new int[]{3,1,2,3,6})));
		System.out.println("exp [2, 4, 3, 2, 0]");
	}

	public static int[] solution(int[] A) {
		if(A.length == 1){
			return new int[]{0};
		}
		int[] sortedA = Arrays.copyOf(A, A.length);
		Arrays.sort(sortedA);
		Map<Integer, Integer> counts = new HashMap<>();

		int[] res = new int[A.length];
		for(int i=0;i<A.length;i++){
			if(counts.get(A[i]) == null){
				counts.put(A[i], 1);
			} else {
				counts.put(A[i], counts.get(A[i])+1);
			}
			int divisors = 0;
			int j = 0;
			while( j< A.length && sortedA[j] <= A[i]/2){
				if(A[i] % sortedA[j] == 0){
					divisors++;
				}
				j++;
			}

			res[i] = A.length - divisors;
		}

		for(int i=0;i<res.length;i++){
			res[i] -= counts.get(A[i]);
		}

		return res;
	}
}
