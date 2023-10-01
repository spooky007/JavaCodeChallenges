package maharishi;

public class RailRoadTie {

	public static int isRailRoadTie(int[] a) {
		int len = a.length;
		if (len < 2 || a[len - 1] == 0 || a[0] == 0) {
			return 0;
		}
//		boolean nonZero = false;
		for (int i = 1; i < len - 1; i++) {
			if (a[i] == 0) {
				if (a[i + 1] == 0 || a[i - 1] == 0) {
					return 0;
				}
			} else {
//				nonZero = true;
				if (a[i - 1] == 0 && a[i + 1] == 0 || a[i - 1] != 0 && a[i + 1] != 0) {
					return 0;
				}
			}
		}
//		if (nonZero) {
//			return 1;
//		} else {
			return 1;
//		}
	}
}
