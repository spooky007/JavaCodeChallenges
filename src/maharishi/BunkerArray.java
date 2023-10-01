package maharishi;

public class BunkerArray {

	public static int isBunkerArray(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {      // check if element is prime
				if (i != len - 1) {   // making sure it's not end of array
					if (a[i + 1] % 2 == 1) {  // check if it's odd
						return 1;
					}
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
