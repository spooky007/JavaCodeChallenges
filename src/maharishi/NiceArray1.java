package maharishi;

public class NiceArray1 {
	
	public static int isNice(int[] a) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {
				sum += a[i];
			}
		}
		if (sum == a[0]) {
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
