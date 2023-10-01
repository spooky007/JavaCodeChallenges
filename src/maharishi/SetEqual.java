package maharishi;

public class SetEqual {

	public static int isSetEqual(int[] m, int[] n) {
		for (int i = 0; i < m.length; i++) {
			boolean found = false;
			for (int j = 0; j < n.length; j++) {
				if (m[i] == n[j]) {
					found = true;
					break;
				}
			}
			if (found == false) {
				return 0;
			}
		}
		return 1;
	}
}
