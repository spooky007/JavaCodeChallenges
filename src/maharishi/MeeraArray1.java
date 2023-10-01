package maharishi;

public class MeeraArray1 {

	public static int isMeera(int[] a) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i];
			if (a[i] >= i) {
				return 0;
			}
		}
		if (sum != 0) {
			return 0;
		}
		return 1;
	}
}
