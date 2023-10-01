package maharishi;

public class Matches {
	
	public static int matches(int[] a, int[] p) {
		int len1 = a.length;
		int len2 = p.length;
		int sum = 0;
		for (int i = 0; i < p.length; i++) {
			sum += (p[i] > 0 ? p[i] : -p[i]);  
		}
		if (len1 != sum) {
			return 0;
		}
		int index = 0;
		for (int i = 0; i < len2; i++) {
			int count = p[i] > 0 ? p[i] : -p[i];
			boolean negative = p[i] < 0;
			while (count > 0) {
				if (negative && a[index++] > 0 || !negative && a[index++] < 0 ) {
					return 0;
				}
				count--;
			}
		}
		return 1;
	}
}
