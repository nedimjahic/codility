public class L10_CountFactors
{
	public static void main(String[] args) {
		System.out.println("got " + solution(24) + " expected 8");
	}

	public static int solution(int N) {
		int count = 0;
		int sqrt = (int)Math.sqrt(N);
		int i=1;

		while(i<=sqrt){
			if(N%i==0){
				count+=2;
			}
			i++;
		}

		if(sqrt*sqrt==N){
			count--;
		}

		return count;
	}
}
