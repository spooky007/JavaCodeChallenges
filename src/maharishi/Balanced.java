package maharishi;

public class Balanced {

	public static int isBalanced(int[] a) {
		if (a.length % 2 != 0 || a.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == -a[i]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return 0;
			}
		}
		if (sum != 0) {
			return 0;
		}
		return 1;
	}
}
