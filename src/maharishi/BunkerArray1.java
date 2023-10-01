package maharishi;

public class BunkerArray1 {

	public static int isBunker(int[] a) {
		boolean onePresent = false;
		boolean primePresent = false;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				if (onePresent) {
					return 1;
				}
				primePresent = true;
			}
			if (a[i] == 1) {
				if (primePresent) {
					return 1;
				}
				onePresent = true;
			}
		}
		return 0;
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
