package maharishi;

public class LargestDifferenceOfEvens {

	public static int largestDifferenceOfEvens(int[] a) {
		int len = a.length;
		int evenCount = 0;
		int[] evens = new int[len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				evens[index++] = a[i];
			}
		}
		if (index < 2) {
			return -1;
		}
		int largestDifference = Integer.MIN_VALUE;
		for (int i = 0; i < index - 1; i++) {
			for (int j = i + 1; j < index; j++) {
				if (evens[i] - evens[j] > largestDifference) {
					largestDifference = evens[i] - evens[j];
				}
				if (evens[j] - evens[i] > largestDifference) {
					largestDifference = evens[j] - evens[i];
				}
			}
		}
		return largestDifference;
	}
}
