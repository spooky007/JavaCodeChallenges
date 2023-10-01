package maharishi;

public class ComputeHMS {

	public static int[] computeHMS(int seconds) {
		int hour = seconds / 3600;
		int remainder = seconds % 3600;
		int minute = remainder / 60;
		int second = remainder % 60;
		return new int[] {hour, minute, second};
	}
}
