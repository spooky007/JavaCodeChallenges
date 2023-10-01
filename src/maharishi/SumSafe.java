package maharishi;

public class SumSafe {

	public static int isSumSafe(int[] a) {
		int sum = 0;
		if (a.length == 0) {
			return 0;
		}
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == sum) {
				return 0;
			} 
		}
		return 1;
	}
}
