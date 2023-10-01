package maharishi;

public class Centered {
	
	public static int isCentered(int[] a) {
		int len = a.length;
		if (len % 2 == 0) {
			return 0;
		}
		int center = len / 2;
		for (int i = 0; i < len; i++) {
			if (i != center && a[i] <= a[center]) {
				return 0;
			}
		}
		return 1;
	}
}
