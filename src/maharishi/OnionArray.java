package maharishi;

public class OnionArray {

	public static int isOnionArray(int[] a) {
		int len = a.length;
		for (int i = 0, j = len - 1; i < j; i++, j--) {
			if (i + j == len - 1) {
				if (a[i] + a[j] > 10) {
					return 0;
				}
			}
		}
		return 1;
	}
}
