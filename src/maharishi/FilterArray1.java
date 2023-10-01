package maharishi;

public class FilterArray1 {

	public static int isFilter(int[] a) {
		int len = a.length;
		int count9 = 0;
		int count11 = 0;
		int count7 = 0;
		int count13 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				count9++;
			}
			if (a[i] == 11) {
				count11++;
			}
			if (a[i] == 7) {
				count7++;
			}
			if (a[i] == 13) {
				if (count9 > 1) {
					return 0;
				}
				count13++;
			}
		}
		if (count9 > 0 && count11 < 1 || count7 > 0 && count13 > 0) {
			return 0;
		}
		return 1;
	}
}
