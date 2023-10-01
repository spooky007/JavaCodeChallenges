package maharishi;

public class Complete {

	public static int isComplete(int[] a) {
		boolean even = false;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && a[i] > max) {
				max = a[i];
			}
			if (a[i] % 2 == 0 && a[i] < min) {
				min = a[i];
			}
			if (a[i] % 2 == 0) {
				even = true;
			}
		}
		if (min == max || !even) {
			return 0;
		}
		for (int i = min; i <= max; i++) {
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					found = true;
					break;
				}
			}
			if (found == false) {
				return 0;
			}
		}
		return 1;
	}
}
