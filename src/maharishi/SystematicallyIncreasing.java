package maharishi;

public class SystematicallyIncreasing {
	
	public static int isSystematicallyIncreasing(int[] a) {
		int len = a.length;
		for (int i = 1; i < len; i++) {
			if (a[i] <= a[i - 1]) {
				return 0;
			}
		}
		return 1;
	}
}
