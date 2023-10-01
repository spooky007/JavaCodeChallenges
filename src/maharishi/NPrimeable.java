package maharishi;

public class NPrimeable {

	public static int isNPrimeable(int[] a, int n) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i] + n) == false) {
				return 0;
			}
		}
		return 1;
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n >= 0;
	}
}
