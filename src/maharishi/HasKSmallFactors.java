package maharishi;

public class HasKSmallFactors {

	public static boolean hasKSmallFactors(int k, int n) {
		for (int u = 0; u < k; u++) {
			for (int v = u + 1; v < k; v++) {
				if (u * v == n) {
					return true;
				}
			}
		}
		return false;
	}
}
