package maharishi;

import java.util.Arrays;

public class DoIntegerBasedRounding {
	
	public static void main(String[] args) {
		int[] arr = new int[] {-18, 1, 2, 3, 4, 5};
		doIntegerBasedRounding( arr, 4);
		System.out.println(Arrays.toString(arr));
	}

	public static void doIntegerBasedRounding(int[] a, int n) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] <= 0) {
				continue;
			} else {
				a[i] = round(a[i], n);
			}
		}
	}

	public static int round(int num, int base) {
		int sum = 0;
		int temp = 0;
		while (sum < num) {
			temp = sum;
			sum += base;
		}
		if (sum == num) {
			return num;
		} else if (sum - num < num - temp) {
			return sum;
		} else if (sum - num > num - temp) {
			return temp;
		} else {
			return sum;
		}
	}
}
