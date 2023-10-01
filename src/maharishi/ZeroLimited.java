package maharishi;

public class ZeroLimited {
	
	public static void main(String[] args) {
		System.out.println(isZeroLimited(new int[]{1, 0, 5, -1, 0, 2, 3, 0, 8}));
	}

	public static int isZeroLimited(int[] a) {
		int len = a.length;
		int n = 0;
		int zeroIndex = (3 * n++) + 1;
		for (int i = 0; i < len; i++) {
			if ( i == zeroIndex ) {
				if (a[i] != 0) {
					return 0;
				}
				zeroIndex = (3 * n++) + 1;
			} else {
				if (a[i] == 0) {
					return 0;
				}
			}
		}
		return 1;
	}
}
