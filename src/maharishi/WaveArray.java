package maharishi;

public class WaveArray {

	public static int isWave(int[] a) {
		int len = a.length;
		for (int i = 0; i < len - 1; i++) {
			if (a[i] % 2 == 0 && a[i + 1] % 2 == 0 || a[i] % 2 == 1 && a[i + 1] % 2 == 1) {
				return 0;
			}
		}
		return 1;
	}
}
