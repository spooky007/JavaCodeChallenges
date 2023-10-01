package maharishi;

public class PairedN {

	public static int isPairedN(int[] a, int n) {
		int len = a.length;
		if (n <= 0 || len <= 1) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (i + j == n && a[i] + a[j] == n) {
					return 1;
				}
			}
		}
		return 0;
	}
}
