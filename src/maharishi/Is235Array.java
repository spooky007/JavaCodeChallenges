package maharishi;

public class Is235Array {

	public static int is235Array(int[] a) {
		int sum = 0;
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				sum++;
			}
			if (a[i] % 3 == 0) {
				sum++;
			}
			if (a[i] % 5 == 0) {
				sum++;
			}
			if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
				sum++;
			}
		}
		if (sum == len) {
			return 1;
		}
		return 0;
	}
}
