package maharishi;

public class OddValent {

	public static int isOddValent(int [] a) {
		int len = a.length;
		boolean odd = false;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 1) {
				odd = true;
			}
			for (int j = i + 1; j < len; j++) {
				if (a[j] % 2 == 1) {
					odd = true;
				}
				if (a[i] == a[j]) {
					if (odd) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}
