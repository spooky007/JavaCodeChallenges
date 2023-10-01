package maharishi;

import java.util.Arrays;

public class EncodedNumber {
	
//	public static void main(String[] args) {
//		System.out.println(Arrays.toString(encodedNumber(2)));
//		System.out.println(Arrays.toString(encodedNumber(6)));
//		System.out.println(Arrays.toString(encodedNumber(14)));
//		System.out.println(Arrays.toString(encodedNumber(24)));
//		System.out.println(Arrays.toString(encodedNumber(1200)));
//		System.out.println(Arrays.toString(encodedNumber(1)));
//		System.out.println(Arrays.toString(encodedNumber(-18)));
//	}
	
	public static int[] encodedNumber(int n) {
		if (n < 2) {
			return null;
		}
		int[] tempPrimes = new int[n/2];
		int k = 0;
		for (int i = 2; i <= n; i++) {
			if ( n % i == 0 && isPrime(i)) {
				tempPrimes[k++] = i;
			}
		}
		int[] primes = new int[k];
		for (int i = 0; i < k; i++) {
			primes[i] = tempPrimes[i];
		}
		int[] tempResult = new int[n/2];
		int index = 0;
		for (int i = primes.length - 1; i >= 0; i--) {
			int remainder = 0;
			while (remainder == 0) {
				remainder = n % primes[i];
				if (remainder == 0) {
					tempResult[index++] = primes[i];
				} else {
					break;
				}
				n /= primes[i];
			}
		}
		int[] result = new int[index];
		int j = 0;
		for (int i = index - 1; i >= 0; i--) {
			result[j++] = tempResult[i];
		}
		return result;
	}
	
	public static boolean isPrime(int n) {
		if (n < 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
