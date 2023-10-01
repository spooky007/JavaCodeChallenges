package maharishi;

public class GutherieSequence {

	public static int isGutherieSequence(int[] a) {
		int len = a.length;
		 if (len < 2 || a[len - 1] != 1) {
			 return 0;
		 }
		int n = a[0];
		for (int i = 1; i < len; i++) {
		if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (n * 3) + 1;
			}
			if (a[i] != n) {
				return 0;
			}
		}
		return 1;
	}
}
