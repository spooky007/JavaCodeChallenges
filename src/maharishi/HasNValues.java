package maharishi;

public class HasNValues {

	public static int hasNValues(int[] a, int n) {
		int len = a.length;
		int[] distinctNums = new int[len];
		int k = 0;
		for (int i = 0; i < len; i++) {
			boolean found = false;
			for (int j = 0; j < k; j++) {
				if (a[i] == distinctNums[j]) {
					found = true;
				}
			}
			if (!found) {
				distinctNums[k++] = a[i];
			}
		}
		if (n != k) {
			return 0;
		}
		return 1;
	}
}
