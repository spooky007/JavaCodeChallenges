package maharishi;

public class NUnique {

	public static int isNUnique(int[] a, int n) {
		int len = a.length;
		int sum5 = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] + a[j] == n) {
					sum5++;
				}
				if (sum5 > 1) {
					return 0;
				}
			}
		}
		if (sum5 == 0) {
			return 0;
		}
		return 1;
	}
}
