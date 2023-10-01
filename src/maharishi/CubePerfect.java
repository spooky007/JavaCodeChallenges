package maharishi;

public class CubePerfect {
	
	public static int isCubePerfect(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (!isCube(a[i])) {
				return 0;
			}
		}
		return 1;
	}

	private static boolean isCube(int n) {
		int num = n >= 0 ? n : -n;
		int cube = 0;
		int i = 0;
		while (cube <= num) {
			cube = i * i * i;
			if (cube == num) {
				return true;
			} else {
				i++;
			}
		}
		return false;
	}
	
}
