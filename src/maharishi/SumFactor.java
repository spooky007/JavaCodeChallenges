package maharishi;

public class SumFactor {

	public static int sumFactor(int[] a) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i];
		}
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == sum) {
				count++;
			}
		}
		return count;
	}
}
