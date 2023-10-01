package maharishi;

public class DualArray1 {

	public static int isDual(int[] a) {
		int len = a.length;
		if (len % 2 != 0) {
			return 0;
		}
		if (len == 2 || len == 1) {
			return 1;
		}
		int sum = a[0] + a[1];
		for (int i = 1; i < len; i += 2) {
			if( a[i] + a[i - 1] != sum ) {
				return 0;
			}
		}
		return 1;
	}
}
