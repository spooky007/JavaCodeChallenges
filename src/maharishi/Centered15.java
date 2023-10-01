package maharishi;

public class Centered15 {
	
	public static int isCentered15(int[] a) {
		int len = a.length;
		for (int i = 0, j = len - 1; i <= j; i++, j--) {
			int sum = 0;
			int left = i;
			int right = j;
			while (left <= right) {
				if (left < right) {
					sum += a[left] + a[right];
				} else if (left == right) {
					sum += a[left];
				}
				if (sum == 15 && right - left <= 1) {
					return 1;
				}
				if (sum > 15) {
					break;
				}
				left++;
				right--;
			}
		}
		return 0;
	}
}
