package maharishi;

public class Complete1 {

	public static int isComplete(int[] a) {
		int len = a.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] <= 0) {
				return 0;
			}
			if (a[i] % 2 == 0 && a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 2; i < max; i += 2) {
			boolean found = false;
			for (int j = 0; j < len; j++) {
				if (a[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				return 0;
			}
		}
		return 1;
	}
}
