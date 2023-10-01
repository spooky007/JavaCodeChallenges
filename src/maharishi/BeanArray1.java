package maharishi;

public class BeanArray1 {

	public static int isBean(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			boolean found = false;
			for (int j = 0; j < len; j++) {
				if (a[j] == 2 * a[i] || a[j] == (2 * a[i]) + 1 || a[j] == a[i] / 2) {
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
