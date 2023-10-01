package maharishi;

public class OneBalanced {

	public static int isOneBalanced(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 1;
		}
		int count1 = 0;
		int countNon1 = 0;
		boolean middleStart = false;
		boolean middleEnd = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				if (middleStart == true) {
					middleEnd = true;
				}
				count1++;
			} else {
				if (middleStart == false) {
					middleStart = true;
				}
				if (middleEnd == true) {
					return 0;
				}
				countNon1++;
			}
		}
		if (count1 != countNon1) {
			return 0;
		} else {
			return 1;
		}
	}
}
