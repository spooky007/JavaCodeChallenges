package maharishi;

public class Divisible {

	public static int isDivisible(int[] a, int n) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] % n != 0) {
				return 0;
			}
		}
		return 1;
	}
}
