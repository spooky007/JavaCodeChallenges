package maharishi;

public class Is121Array {

	public static int is121Array(int[] a) {
		int len = a.length;
		if (len < 3) {
			return 0;
		}
		boolean leftFlag = false, rightFlag = false, flag1 = false, flag2 = false;
//		if (a[0] != 1 && a[len - 1] != 1) {
//			return 0;
//		}
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				flag1 = true;
			} else if (a[i] == 2) {
				flag2 = true;
			} else {
				return 0;
			}
		}
		if (!flag1 || !flag2) return 0;
		for (int i = 0, j = len - 1; i <= j; i++, j--) {
			if (a[i] != 1) {
				leftFlag = true;
			}
			if (a[j] != 1) {
				rightFlag = true;
			}
			if (leftFlag != rightFlag) {
				return 0;
			}
			if (leftFlag && a[i] == 1 || rightFlag && a[j] == 1) {
				return 0;
			} 
		}
		return 1;
	}
}
