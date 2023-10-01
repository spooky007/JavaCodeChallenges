package maharishi;

public class LargestAdjacentSum {

	public static int largestAdjacentSum(int[] a) {
		int len = a.length;
		int largestAdjacentSum = Integer.MIN_VALUE;
		for (int i = 0; i < len - 1; i++) {
			if (a[i] + a[i + 1] > largestAdjacentSum) {
				largestAdjacentSum = a[i] + a[i + 1];
			}
		}
		return largestAdjacentSum;
	}
}
