package maharishi;

public class AllPosibilities {

	public static int isAllPosibilities(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		int[] b = new int[len];
		for (int i = 0; i < len; i++) {
			b[i] = i;
		}
		for (int i = 0; i < len; i++) {
			boolean found = false;
			for (int j = 0; j < len; j++) {
				if (b[i] == a[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return 0;
			}

		}
		return 1;
	}
}
