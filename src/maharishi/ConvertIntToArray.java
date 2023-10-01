package maharishi;

import java.util.Arrays;

public class ConvertIntToArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intToArray(678)));
	} 
	public static int[] intToArray(int n) {
		int size = 0;
		int i = n;
		while (i > 0) {
			i /= 10;
			size++;
		}
		int[] arr = new int[size];
		int index = 0;
		while (n > 0) {
			int remainder = n % 10;
			arr[index++] = remainder;
			n /= 10;
		}
		int[] arr2 = new int[size];
		int j = 0;
		for (int k = size - 1; k >= 0 ; k--) {
			arr2[j++] = arr[k];
		}
		return arr2;
	}
}
