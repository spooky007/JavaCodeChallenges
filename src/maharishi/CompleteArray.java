package maharishi;

public class CompleteArray {

	public static int isComplete(int[] a) {
		int len = a.length;
		boolean even = false;
		boolean square = false;
		boolean sum8 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				even = true;
			}
			if (a[i] != 1 && isSquare(a[i])) {
				square = true;
			}
			if (!sum8) {
				for(int j = i + 1; j < len; j++) {
					if (a[i] + a[j] == 8) {
						sum8 = true;
						break;
					}
				}
			}
			if (sum8 && square && even) {
				return 1;
			}
		}
		return 0;
	}

	private static boolean isSquare(int n) {
		for (int i = 0; i * i <= n; i++) {
			if (i * i == n) {
				return true;
			}
		}
		return false;
	}
}
