package maharishi;

public class Inertial {

	public static int isInertial(int[] a) {
		int len = a.length;
		boolean odd = false;
		int maxValue = Integer.MIN_VALUE;
		int smallestOdd = Integer.MAX_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
			if (a[i] % 2 == 1 && a[i] < smallestOdd) {
				smallestOdd = a[i];
			}
			if (a[i] % 2 == 1) {
				odd = true;
			}
		}
		if (maxValue % 2 != 0 || odd == false) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0 && a[i] != maxValue && a[i] > smallestOdd) {
				return 0;
			}
		}
		return 1;
	}
}
