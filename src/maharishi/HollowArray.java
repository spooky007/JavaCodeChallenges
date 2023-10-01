package maharishi;

public class HollowArray {

	public static int isHollow(int[] a) {
		int len = a.length;
		int left = 0;
		int right = 0;
		int middle = 0;
		boolean start = false;
		boolean end = false;
		for (int i = 0; i < len; i++) {
			if (a[i] != 0) {
				left++;
			} else {
				break;
			}
		}
		for (int i = len - 1; i >= 0; i--) {
			if (a[i] != 0) {
				right++;
			} else {
				break;
			}
		}
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				start = true;
				middle++;
				if (end) {
					return 0;
				}
				
			} else {
				if (start) {
					end = true;
				}
			}
		}
		if (left != right) {
			return 0;
		}
		if (middle < 3) {
			return 0;
		}
		return 1;
	}
}
