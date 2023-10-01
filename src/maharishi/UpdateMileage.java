package maharishi;

import java.util.Arrays;

public class UpdateMileage {
	
	public static void main(String[] args) {
		int[] a = {8, 9, 9, 5, 0};
		int[] b = {8, 9, 9, 5, 0};
		int[] c = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
		int[] d = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
		
		updateMileageCounter(a, 1);
		updateMileageCounter(b, 2);
		updateMileageCounter(c, 1);
		updateMileageCounter(d, 13);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
	}

	public static void updateMileageCounter(int[] a, int miles) {
			int len = a.length;
			int carrier = miles;
			for (int i = 0; i < len; i++) {
				int remainder = (carrier + a[i]) % 10;
				carrier = (carrier + a[i]) / 10;
				a[i] = remainder;
			}
	}
}
