import java.util.Arrays;

public class L3_FrongJmp
{
	public static void main(String[] args) {
		System.out.println("got " + solution(10, 85, 30) + " expected 3");
	}

	public static int solution(int X, int Y, int D) {
		int dist = Y - X;
		int stepsWithinDist = dist / D;

		return dist % D == 0 ? stepsWithinDist : stepsWithinDist + 1;
	}
}
