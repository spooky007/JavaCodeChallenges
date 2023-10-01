package maharishi;

public class CountDigit {

	public static int countDigit(int n, int digit) {
		int count = 0;
		while (n != 0) {
			int remainder = n % 10;
			if (remainder == digit) {
				count++;
			}
			n /= 10;
		}
		return count;
	}
}
