// TODO 66%->100%
public class L12_ChocolatesByNumbers
{
	public static void main(String[] args) {
		System.out.println("got " + solution(10, 4));
		System.out.println("exp 5");
		System.out.println("got " + solution(100, 5));
		System.out.println("exp 20");
	}

	public static int solution(int N, int M) {
		return N/gcd(N,M);
	}

	private static int gcd(int a, int b){
		if(a%b==0){
			return b;
		}

		return gcd(b, a%b);
	}
}
