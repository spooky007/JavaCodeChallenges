package maharishi;

public class PrimeCount {

	public static void main(String[] args) {
		System.out.println(primeCount(10, 30));
		System.out.println(primeCount(11, 29));
		System.out.println(primeCount(20, 22));
		System.out.println(primeCount(1, 1));
		System.out.println(primeCount(5, 5));
		System.out.println(primeCount(6, 2));
		System.out.println(primeCount(-10, 6));
	}
	
	public static int primeCount(int a, int n) {
		int primeCount = 0;
		for (int i = a; i < n + 1; i++) {
			boolean isPrime = true;
			if (i < 2) {
				isPrime = false;
			}
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				primeCount++;
			}
		}
		return primeCount;
	}
	
}
