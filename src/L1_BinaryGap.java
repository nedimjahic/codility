public class L1_BinaryGap
{
	public static void main(String[] args)
	{
		System.out.println("got " + solution(1041) + " expected 5");
		System.out.println("got " + solution(15) + " expected 0");
		System.out.println("got " + solution(32) + " expected 0");
	}

	public static int solution(int N) {
		char[] c = Integer.toBinaryString(N).toCharArray();

		int maxGap = 0;
		int currGap = 0;
		char lastChar = c[0];

		for(int i=0; i<c.length;i++){
			if(c[i] == '0'){
				if(currGap == 0 || lastChar == '0'){
					currGap++;
				}
			} else {
				maxGap = Math.max(currGap, maxGap);
				currGap = 0;
			}
			lastChar = c[i];
		}

		return maxGap;
	}
}
