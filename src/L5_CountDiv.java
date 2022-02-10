public class L5_CountDiv
{
	public static void main(String[] args) {
		System.out.println("got " + solution(11,14,2) + " expected 2");
		System.out.println("got " + solution(0,0,11) + " expected 1");
		System.out.println("got " + solution(6,11,2) + " expected 3");
	}

	public static int solution(int A, int B, int K) {

		if(K>A){
			int count = A%K == 0 ? 1 : 0;
			return B/K + count;
		} else {
			A += A%K;
			int count = A%K == 0 ? 1 : 0;

			if(A>B){
				return count;
			}

			return (B-A)/K +count;
		}
	}
}
