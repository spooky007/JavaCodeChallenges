package maharishi;

public class ZeroBalanced {

	public static int isZeroBalanced(int[] a) {
		int len = a.length;
		if (len == 0 || len % 2 != 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i];
			boolean found = false;
			for (int j = 0; j < len; j++) {
				if (a[j] == -a[i] && i != j) {
					found = true;
					break;
				}
			}
			if (!found) {
				return 0;
			}
		}
		if (sum != 0) {
			return 0;
		}
 		return 1;
	}
}
