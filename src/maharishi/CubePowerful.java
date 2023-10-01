package maharishi;

public class CubePowerful {

	public static int isCubePowerful(int n) {
		if (n < 1) {
			return 0;
		}
		int quotient = n;
		int sum = 0;
		while (quotient != 0) {
			int remainder = quotient % 10;
			sum += remainder * remainder * remainder;
			quotient /= 10;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
