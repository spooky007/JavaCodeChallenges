package maharishi;

public class PerfectNumber {
	
	public static void main(String[] args) {
//		System.out.println(isPerfectNumber(6));
		System.out.println(henry(1, 3));
	}

	public static int henry(int i, int j) {
		int position = 0;
		int sum = 0;
		for (int k = 1; ; k++) {
			if (isPerfectNumber(k)) {
				position++;
				if (position == i) {
					sum += k;
				}
				if (position == j) {
					sum += k;
					break;
				}
			}
		}
		return sum;
	}
	
	public static boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}
}
