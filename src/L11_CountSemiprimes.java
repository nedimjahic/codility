import java.util.Arrays;

// TODO 66%->100%
public class L11_CountSemiprimes
{
	public static void main(String[] args) {
		System.out.println("got " + Arrays.toString(solution(26, new int[]{1,4,16}, new int[]{26,10,20})));
		System.out.println("exp [10, 4, 0]");
	}

	public static int[] solution(int N, int[] P, int[] Q) {
		int [] counts = new int[P.length];

		boolean[] primes = new boolean[N+1];
		for(int i=2;i<N;i++){
			primes[i] = true;
		}

		for(int i=2;i*i<N;i++){
			if(primes[i]){
				for(int k = i*i;k<=N;k+=i){
					primes[k] = false;
				}
			}
		}


		boolean[] semiPrimes = new boolean[N+1];

		for(int i=2;i<=N;i++){
			if(isSemiprime(i, primes)){
				semiPrimes[i] = true;
			}
		}

		for(int i=0;i<P.length;i++){
			int count = 0;
			//System.out.println("Counting primes " + P[i] + " to " + Q[i]);
			if(Q[i] < 2){
				continue;
			}
			for(int j=P[i]; j<=Q[i];j++){
				if(semiPrimes[j]){
					count++;
				}
			}
			counts[i] = count;
		}

		return counts;
	}

	private static boolean isSemiprime(int A, boolean[] primes) {
		for(int i=2;i*i<=A;i++){
			if(primes[i] && (A%i==0 && primes[A/i])){
				//System.out.println("Number is semiprime " + A + " cuz " + i + "*" + (A/i));
				return true;
			}
		}

		return false;
	}
}
