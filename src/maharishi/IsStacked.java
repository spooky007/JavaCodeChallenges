package maharishi;

public class IsStacked {

	public static int isStacked(int n) {
		int sum = 0;
		int number = 1;
		while (sum < n) {
			sum += number;
			number++;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
