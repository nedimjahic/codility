import java.util.Arrays;

public class L5_GenomicRangeQuery
{
	public static void main(String[] args) {
		System.out.println("got " + Arrays.toString(solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})) + " expected [2, 4, 1]");
		System.out.println("got " + Arrays.toString(solution("A", new int[]{0}, new int[]{0})) + " expected [1]");
		System.out.println("got " + Arrays.toString(solution("AC", new int[]{0, 0, 1}, new int[]{0, 1, 1})) + " expected [1, 1, 2]");
	}

	public static int[] solution(String S, int[] P, int[] Q) {
		char[] chars = S.toCharArray();
		int[] res = new int[P.length];
		int[][] nucleoCounters = new int[4][S.length()];

		for(int i=0;i<chars.length;i++){
			int a = 0;
			int c = 0;
			int g = 0;

			if(chars[i] == 'A'){
				a++;
			} else if(chars[i] == 'C'){
				c++;
			} else if(chars[i] == 'G'){
				g++;
			}

			int index = i != 0 ? i-1 : i;
			nucleoCounters[0][i] = nucleoCounters[0][index] + a;
			nucleoCounters[1][i] = nucleoCounters[1][index] + c;
			nucleoCounters[2][i] = nucleoCounters[2][index] + g;
		}

		for(int i=0;i<P.length;i++){
			if(nucleoCounters[0][Q[i]] > (P[i] != 0 ? nucleoCounters[0][P[i]-1] : 0)){
				res[i] = 1;
			} else if(nucleoCounters[1][Q[i]] > (P[i] != 0 ? nucleoCounters[1][P[i]-1] : 0)){
				res[i] = 2;
			} else if(nucleoCounters[2][Q[i]] > (P[i] != 0 ? nucleoCounters[2][P[i]-1] : 0)){
				res[i] = 3;
			} else {
				res[i] = 4;
			}
		}

		return res;
	}
}
