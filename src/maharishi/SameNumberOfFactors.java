package maharishi;

public class SameNumberOfFactors {

	public static int sameNumberOfFactors(int n1, int n2) {
		if (n1 < 0 || n2 < 0) {
			return -1;
		}
		int size1 = numOfFactors(n1);
		int size2 = numOfFactors(n2);
		if (size1 != size2) {
			return 0;
		}
		return 1;
	}

	private static int numOfFactors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}
}
