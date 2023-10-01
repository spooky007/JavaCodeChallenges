package maharishi;

public class MeeraArray {

	public static int isMeera(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (a[j] == 2 * a[i]) {
					return 0;
				}
			}
		}
		return 1;
	}
}
