package maharishi;

public class Fibonacci {

	public static int isFibonacci(int n) {
		int previous = 1;
		int next = 1;
		int sum = 0;
		while (sum < n) {
			sum = previous + next;
			previous = next;
			next = sum;
		}
		if (next == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
