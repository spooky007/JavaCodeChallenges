package maharishi;

public class FactorialPrime {

	public static int isFactorialPrime(int n) {
		if (!isPrime(n)) {
			return 0;
		}
		int k = 0;
		while (factorial(k) < n) {
			if (factorial(k) + 1 == n) {
				return 1;
			}
			k++;
		}
		return 0;
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n >= 2;
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
