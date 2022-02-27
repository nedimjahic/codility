import java.util.ArrayList;
import java.util.List;

// TODO 60%->100%
public class L10_Flags
{
	public static void main(String[] args) {
		System.out.println("got " + solution(new int[]{1,5,3,4,3,4,1,2,3,4,6,2}) + " expected 3");
	}

	public static int solution(int[] A) {
		if(A.length < 3){
			return 0;
		}
		List<Integer> peaks = new ArrayList<>();

		for(int i=1;i<A.length-1;i++){
			if(A[i] > A[i-1] && A[i] > A[i+1]){
				peaks.add(i);
			}
		}

		int flagsToPlant = 0;
		for(int flags=peaks.size();flags>0;flags--){
			//System.out.println("Flags brought " + flags);
			int tempFlagsToPlant = 0;
			int lastFlagIndex  = 0;
			for(int j=0;j<peaks.size();j++){
				//System.out.println("lastFlagIndex " + peaks.get(lastFlagIndex));
				//System.out.println("tempFlagsToPlant == flags (" + (tempFlagsToPlant == flags) + ")");
				if(tempFlagsToPlant == flags){
					break;
				}
				if(tempFlagsToPlant == 0){
					lastFlagIndex = j;
					tempFlagsToPlant++;
					//System.out.println("Probing peak " + peaks.get(j) + "(true)");
					continue;
				}

				//System.out.println("Probing peak " + peaks.get(j) + ", distance from last " + (peaks.get(j) - peaks.get(lastFlagIndex)));

				if(peaks.get(j) - peaks.get(lastFlagIndex) >= flags){
					tempFlagsToPlant++;
					lastFlagIndex = j;
				}
				//System.out.println("Flags brought " + flags + ", able to be planted " + tempFlagsToPlant);
				flagsToPlant = Math.max(flagsToPlant, tempFlagsToPlant);
			}
		}

		return flagsToPlant;
	}
}
