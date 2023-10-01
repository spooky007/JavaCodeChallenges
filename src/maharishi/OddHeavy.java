package maharishi;

public class OddHeavy {

	public static int isOddHeavy(int[] a) {
		int len = a.length;
		boolean isOdd = false;
		int minOdd = Integer.MAX_VALUE;
		int maxEven = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 1) {
				isOdd = true;
				if (a[i] < minOdd) {
					minOdd = a[i];
				}
			}
			if (a[i] % 2 == 0) {
				if (a[i] > maxEven) {
					maxEven = a[i];
				}
			}
		}
		if (minOdd > maxEven && isOdd == true) {
			return 1;
		} else {
			return 0;
		}
	}
}
