package maharishi;

public class PorcupineNumber {
	public static void main(String[] args) {
		System.out.println(findPorcupineNumber(0));
	}

	public static int findPorcupineNumber(int n) {
		for (int i = n + 1;; i++) {
			if (isPrime(i) == 1 && i % 10 == 9) {
				for (int j = i + 1;; j++) {
					if (isPrime(j) == 1) {
						if (j % 10 == 9) {
							return i;
						} else {
							break;
						}
					}
				}
			}
		}
	}

	public static int isPrime(int n) {
		if (n < 2) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
