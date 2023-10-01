package maharishi;

public class TwinArray {

	public static int isTwin(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (isPrime(arr[i]) && hasTwinPrime(arr[i])) {
				boolean found = false;
				for (int j = 0; j < len; j++) {
					if (arr[j] == arr[i] - 2 && isPrime(arr[j])|| arr[j] == arr[i] + 2 && isPrime(arr[j])) {
						found = true;
						break;
					}
				}
				if (!found ) {
					return 0;
				}
			}
		}
		return 1;
	}
	
	private static boolean hasTwinPrime(int n) {
		if (isPrime(n - 2) || isPrime(n + 2)) {
			return true;
		}
		return false;
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
