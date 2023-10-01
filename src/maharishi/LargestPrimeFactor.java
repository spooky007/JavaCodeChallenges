package maharishi;

public class LargestPrimeFactor {

	public static int largestPrimeFactor(int n) {
		if (n <= 1) {
			return 0;
		}
		int largestPrimeFactor = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				if (isPrime(i) && i > largestPrimeFactor) {
					largestPrimeFactor = i;
				}
			}
		}
		return largestPrimeFactor;
	}

	public static boolean isPrime(int n) {
		if (n < 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
