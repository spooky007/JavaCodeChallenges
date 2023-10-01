package maharishi;

public class FactorEqual {

	public static int factorEqual(int n, int m) {
		int first = getNumFactors(n);
		int second = getNumFactors(m);
		if (first == second) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int getNumFactors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}
}
