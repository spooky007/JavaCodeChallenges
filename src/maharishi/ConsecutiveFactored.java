package maharishi;

public class ConsecutiveFactored {

	public static int isConsecutiveFactored(int n) {
		int k = 2;
		int lastFactor = Integer.MIN_VALUE;
		while (k < n) {
			if (n % k == 0) {
				if (k - lastFactor == 1) {
					return 1;
				} else {
					lastFactor = k;
				}
			}
			k++;
		}
		return 0;
	}
}
