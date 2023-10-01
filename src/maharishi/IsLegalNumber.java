package maharishi;

public class IsLegalNumber {

	public static int isLegalNumber(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= n) {
				return 0;
			}
		}
		return 1;
	}
}
