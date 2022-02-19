public class L9_MaxProfit
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{1,3,5,9}) + " expected 8");
		System.out.println("got " + solution(new int[0]) + " expected 0");
		System.out.println("got " + solution(new int[]{5,5,5,5,5}) + " expected 0");
		System.out.println("got " + solution(new int[]{10,8,6,4,2}) + " expected 0");
	}

	public static int solution(int[] A) {
		if(A.length==0){
			return 0;
		}
		int minPrice = A[0];
		int maxProfit = 0;

		for(int i=0;i<A.length;i++){
			minPrice = Math.min(minPrice, A[i]);
			maxProfit = Math.max(A[i] - minPrice, maxProfit);
		}

		return maxProfit;
	}
}
