package maharishi;

public class FineArray {

	public static int isFineArray(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			boolean found = false;
			if (isPrime(a[i])) {
				for (int j = 0; j < len; j++) {
					if ((a[j] == a[i] + 2) && (isPrime(a[j])) || (a[j] == a[i] - 2) && isPrime(a[j])) {
						found = true;
						break;
					}
				}
				if (!found) {
					return 0;
				}
			}
		}
		return 1;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n >= 2;
	}
}
