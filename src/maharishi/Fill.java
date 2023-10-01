package maharishi;

public class Fill {
	
	

	public static int[] fill(int[] arr1, int k, int n) {
		int len = arr1.length;
		if (k <= 0 || n <= 0) {
			return null;
		}
		int[] arr2 = new int[n];
		int j = 0;
		for (int i = 0; j < n; i++) {
			arr2[j++] = arr1[i];
			if (i == k - 1) {
				i = -1;
			}
		}
		return arr2;
	}
}
