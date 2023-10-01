package maharishi;

public class PrimeHappy {
	
	public static void main(String[] args) {
//		System.out.println(isPrime(29));
	}

	public static int isPrimeHappy(int n) {
		if (n <= 2) {
			return 0;
		}
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		if (sum % n == 0) {
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
