package maharishi;

public class DigitSum {

	public static int isDigitSum(int n, int m) {
		int sum = 0;
		if (n < 0 || m < 0) {
			return -1;
		}
		while (n != 0) {
			int remainder = n % 10;
			sum += remainder;
			n /= 10;
		}
		if (sum < m) {
			return 1;
		}
		return 0;
	}
}
