public class L10_MinPerimeterRectangle
{
	public static void main(String[] args) {
		System.out.println("got " + solution(30) + " expected 22");
		System.out.println("got " + solution(1) + " expected 4");
		System.out.println("got " + solution(36) + " expected 24");
	}

	public static int solution(int N) {
		int minPer = Integer.MAX_VALUE;
		int i=1;
		while(i*i<=N){
			if(N%i==0){
				//System.out.println("2 * (" + i + " + " + (N/i) + ") = " + (2*(i+(N/i))));
				minPer = Math.min(minPer, 2*(i+(N/i)));
			}
			i++;
		}

		return minPer;
	}
}
