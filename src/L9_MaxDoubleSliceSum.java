// Only 53% for now
public class L9_MaxDoubleSliceSum
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{3,2,6,-1,4,5,-1,2}) + " expected 17");
		System.out.println("got " + solution(new int[]{1,2,3}) + " expected 0");
	}

	public static int solution(int[] A) {
		int maxSum = Integer.MIN_VALUE;
		for(int i=1;i<A.length;i++){
			A[i] = A[i] + A[i-1];
		}

		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if(i==j){
					continue;
				}

				for(int k=j+1;k<A.length;k++){
					if(j==k){
						continue;
					}

					int sum1 = A[j-1] - A[i];
					int sum2 = A[k-1] - A[j];

					//System.out.println(i + "," + j + "," + k + "=" + sum1 + "+" + sum2);

					maxSum = Math.max(maxSum, sum1+sum2);
				}
			}
		}

		return maxSum;
	}
}
