package maharishi;

public class Hodder {
	
	public static int isHodder(int n) {
		if (!isPrime(n)) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			int operation = power(2, i);
			if (operation - 1 == n) {
				return 1;
			}
			if (operation - 1 > n) {
				break;
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
	
	public static int power(int number, int power) {
		int result = 1;
		while (power > 0) {
			result *= number;
			power--;
		}
		return result;
	}
}
