package maharishi;

public class FilterArray2 {

	public static int isFilterArray(int[] a) {
		int len = a.length;
		boolean count9 = false;
		boolean count11 = false;
		boolean count7 = false;
		boolean count13 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				count9 = true;
			}
			if (a[i] == 11) {
				count11 = true;
			}
			if (a[i] == 7) {
				if (count13) {
					return 0;
				}
				count7 = true;
			}
			if (a[i] == 13) {
				if (count7 ) {
					return 0;
				}
				count13 = true;
			}
		}
		if (count9 && !count11) {
			return 0;
		}
		return 1;
	}
}
