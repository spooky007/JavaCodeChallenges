package maharishi;

public class FancyNumber {

	public static int isFancyNumber(int n) {
		int first = 1;
		int second = 1;
		int number = 0;
		while (number < n) {
			number = (3 * second) + (2 * first);
			first = second;
			second = number;
		}
		if (number == n) {
			return 1;
		}
		return 0;
	}
}
