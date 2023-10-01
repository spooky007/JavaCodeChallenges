package maharishi;

public class DaphneArray {

	public static int isDaphne(int[] a) {
		int len = a.length;
		boolean even = a[0] % 2 == 0;
		for (int i = 0; i < len; i++) {
			if (even) {
				if (a[i] % 2 != 0) {
					return 0;
				}
			} else {
				if (a[i] % 2 == 0) {
					return 0;
				}
			}
		}
		return 1;
	}
}
