package maharishi;

public class ContinuousFactored {

	public static int isContinuousFactored(int n) {
		int[] factors = new int[n / 2];
		int k = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				factors[k++] = i;
			}
		}
		for (int i = 0; i < k; i++) {
			if (n % factors[i] == 0) {
				int product = factors[i];
				int previous = factors[i];
				for (int j = i + 1; product < n; j++) {
					if (factors[j] - previous == 1) {
						product *= factors[j];
						if (product == n) {
							return 1;
						} else if (product > n) {
							break;
						}
						previous = factors[j];
					} else {
						break;
					}
				}
				if (product == n) {
					return 1;
				}
			}
		}
		return 0;
	}
}
