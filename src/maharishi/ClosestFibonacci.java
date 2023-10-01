package maharishi;

public class ClosestFibonacci {

	public static int closestFibonacciSequence(int n) {
		if (n < 1) {
			return 0;
		}
		int previous = 1;
		int next = 1;
		int sum = 0;
		while (sum < n) {
			sum = previous + next;
			previous = next;
			next = sum;
		}
		if (sum == n) {
			return n;
		}                      // fibo numbers:  1, 1, 2, 3, 5, 8, 13, 21, 34
		return previous;
	}
}
