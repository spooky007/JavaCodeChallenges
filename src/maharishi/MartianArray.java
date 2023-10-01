package maharishi;

public class MartianArray {

	public static int isMartian(int[] a) {
		int len = a.length;
		int no1s = 0;
		int no2s = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				no1s++;
			}
			if (a[i] == 2) {
				no2s++;
			}
			if (i != len - 1 && a[i] == a[i + 1]) {
				return 0;
			}
		}
		if (no1s <= no2s) {
			return 0;
		}
		return 1;
	}
}
