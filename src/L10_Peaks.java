import java.util.HashMap;
import java.util.Map;

// TODO 72%->100%
public class L10_Peaks
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{1,2,3,4,3,4,1,2,3,4,6,2}) + " expected 3");
		System.out.println("got " + solution(new int[]{1,2,3,4,5}) + " expected 0");
	}

	public static int solution(int[] A) {
		if(A.length<3){
			return 0;
		}
		Map<Integer, Boolean> peaks = new HashMap<>();

		for(int i=1;i<A.length-1;i++){
			if(A[i] > A[i-1] && A[i] > A[i+1]){
				peaks.put(i, true);
			}
		}

		if(peaks.size() == 1){
			return 1;
		}

		int div = 2;
		int maxSize = 0;
		while(div<A.length/2){
			if(A.length%div != 0){
				div++;
				continue;
			}

			boolean allHavePeaks = true;
			for(int i=0; i<A.length;i+=A.length/div){
				//System.out.println("from " + i + " to " + (i + A.length/div));
				boolean hasPeak = false;
				for(int j=i; j<i+A.length/div;j++){
					if(peaks.get(j) != null && peaks.get(j)){
						hasPeak = true;
						break;
					}
				}
				if(!hasPeak){
					allHavePeaks = false;
					break;
				}
			}
			if(allHavePeaks){
				maxSize = Math.max(maxSize, div);
			}
			div++;
		}

		return maxSize;
	}
}
