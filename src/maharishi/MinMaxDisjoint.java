package maharishi;

public class MinMaxDisjoint {

	public static int isMinMaxDisjoint(int[] a) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int countMin = 0;
		int countMax = 0;
		int indexMin = 0;
		int indexMax = 0;
		if (a.length < 3) return 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) {
				countMax++;
			}
			if (a[i] == min) {
				countMin++;
			}
			if (a[i] > max) {
				max = a[i];
				indexMax = i;
				countMax = 1;
			}
			if (a[i] < min) {
				min = a[i];
				indexMin = i;
				countMin = 1;
			}
		}
		if (min == max || countMin > 1 || countMax > 1 || indexMax - indexMin == 1 || indexMin - indexMax == 1) {
			return 0;
		}
		return 1;
	}
}
