package maharishi;

import java.util.Arrays;

public class FilterArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(filterArray(new int[] {8, 4, 9, 0, 3, 1, 2}, 88)));
	}

	public static int[] filterArray(int[] a, int n) {
 		int len = a.length;
 		if (n == 0) {
 			return new int[] {};
 		}
		int quotient = n;
		int count = 0;
		int[] resultArray = new int[len];
		int j = 0; 
		while (quotient != 0) {
			int remainder = quotient % 2;
			if (remainder != 0) {
				resultArray[j++] = count;
			}
			quotient /= 2;
			count++;
			if (count > len) {
				return null;
			}
		}
		int[] finalArray = new int[j];
		int k = 0;
		for (int i = 0; i < j; i++) {
			finalArray[k++] = a[resultArray[i]];  
		}
		return finalArray;
	}
}
