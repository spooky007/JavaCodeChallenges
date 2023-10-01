package maharishi;

public class NiceArray {

	public static int isNice(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			boolean found = false;
			for (int j = 0; j < len; j++) {
				if (a[j] == a[i] - 1 || a[j] == a[i] + 1) {
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
