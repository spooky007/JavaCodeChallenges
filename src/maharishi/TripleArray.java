package maharishi;

public class TripleArray {

	public static int isTriple(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int count = 0;
			for (int j = 0; j < len; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
			if (count != 3) {
				return 0;
			}
		}
		return 1;
	}
}
