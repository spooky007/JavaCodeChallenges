package maharishi;

public class Mercurial {

	public static int isMercurial(int[] a) {
		int len = a.length;
		boolean first1 = false;
		boolean flag3 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				first1 = true;
				if (flag3) {
					return 0;
				}
			}
			if (a[i] == 3 && first1) {
				flag3 = true;
			}
		}
		return 1;
	}
}
