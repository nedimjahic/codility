import java.util.Arrays;

public class L8_Dominator
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{3,4,3,2,3,-1,3,3}) + " expected 0");
		System.out.println("got " + solution(new int[]{3}) + " expected 0");
	}

	public static int solution(int[] A) {
		if(A.length == 0){
			return -1;
		}

		int[]B = Arrays.copyOf(A, A.length);
		Arrays.sort(A);

		int dominator=A[0];
		boolean hasDom = true;

		int count = 1;
		for(int i=1;i<A.length;i++){
			if(A[i] == A[i-1]){
				count++;
				if(count > A.length/2){
					dominator = A[i];
					break;
				}
			} else {
				count=1;
			}

			if(i>A.length/2 && count==1){
				hasDom=false;
				break;
			}
		}

		if(hasDom){
			for(int i=0;i<B.length;i++){
				if(B[i] == dominator){
					return i;
				}
			}
		}

		return -1;
	}
}
