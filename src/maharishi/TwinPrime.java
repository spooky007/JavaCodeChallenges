package maharishi;

public class TwinPrime {

	public static int isTwinPrime(int n) {
		if (!isPrime(n)) {
			return 0;
		}
		if (isPrime(n + 2) || isPrime(n - 2)) {
			return 1;
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
