package maharishi;

public class Balanced1 {

	public static int isBalanced(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0 && a[i] % 2 == 0 || i % 2 != 0 && a[i] % 2 != 0) {
				continue;
			} else {
				return 0;
			}
		}
		return 1;
	}
}
