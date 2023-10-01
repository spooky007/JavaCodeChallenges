package maharishi;

public class IsSequencedArray {

	public static int isSequencedArray(int[] a, int m, int n) {
		int len = a.length;
		if (a[0] != m || a[len - 1] != n) {
			return 0;
		}
		for (int i = 1; i < len; i++) {
			if (a[i] < a[i - 1] || a[i] - a[i - 1] > 1) {
				return 0;
			}
		}
		return 1;
	}
}

