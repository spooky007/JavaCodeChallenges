package maharishi;

public class Layered {

	public static int isLayered(int[] a) {
		int len = a.length;
		if (len < 2) {
			return 0;
		}
		int count = 1;
		for (int i = 1; i < len; i++) {
			if (a[i] == a[i - 1]) {
				count++;
			}
			if (a[i] > a[i - 1]) {
				if (count < 2) {
					return 0;
				}
			}
			if (a[i] < a[i - 1]) {
				return 0;
			}
		}
		return 1;
	}
}
