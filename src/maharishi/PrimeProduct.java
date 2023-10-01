package maharishi;

public class PrimeProduct {

	public static int isPrimeProduct(int m) {
		int[] primeFactors = new int[m];
		int index = 0;
		for (int i = 2; i < m; i++) {
			if (m % i == 0 && isPrime(i)) {
				primeFactors[index++] = i;
			}
		}
		for (int j = 0; j < index; j++) {
			boolean found = false;
			for (int k = j + 1; k < index; k++) {
				if (primeFactors[j] * primeFactors[k] == m) {
					return 1;
				}
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
