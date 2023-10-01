package maharishi;

public class StantonMeasure {

	public static int isStantonMeasure(int[] a) {
		int count1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				count1++;
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == count1) {
				sum++;
			}
		}
		return sum;
	}
}
