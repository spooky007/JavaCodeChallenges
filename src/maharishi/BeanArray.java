package maharishi;

public class BeanArray {

	public static int isBean(int[] a) {
		int len = a.length;
		int count9 = 0;
		int count13 = 0;
		int count7 = 0;
		int count16 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				count9++;
			}
			if (a[i] == 13) {
				count13++;
			}
			if (a[i] == 7) {
				count7++;
			}
			if (a[i] == 16) {
				if (count7 > 0) {
					return 0;
				}
				count16++;
			}
		}
		if (count9 > 0 && count13 < 1 || count7 > 0 && count16 > 0) {
			return 0;
		}
		return 1;
	}
}
