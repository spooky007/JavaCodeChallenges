package maharishi;

public class Vanilla {

	public static int isVanilla(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 1;
		}
		int digit = a[0] % 10;
		for (int i = 0; i < len; i++) {
			int quotient = a[i] > 0 ? a[i] : -a[i];
			while (quotient != 0) {
				int remainder = quotient % 10;
				if (remainder != digit) {
					return 0;
				}
				quotient /= 10;
			}
		}
		return 1;
	}
}
