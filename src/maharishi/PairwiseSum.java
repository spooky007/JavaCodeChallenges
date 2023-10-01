package maharishi;

import java.util.Arrays;

public class PairwiseSum {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18, -5})));
	}

	public static int[] pairwiseSum(int[] a) {
		int len = a.length;
		if (len % 2 != 0 || len == 0) {
			return null;
		}
		int newLen = len / 2;
		int[] pairSum = new int[newLen];
		int k = 0;
		for (int i = 1; i < len; i += 2) {
			pairSum[k++] = a[i] + a[i - 1];
		}
		return pairSum;
	}
}
