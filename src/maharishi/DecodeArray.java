package maharishi;

public class DecodeArray {
	
	public static void main(String[] args) {
		System.out.println(decodeArray(new int[] {0, -3, 0, -4, 0}));
	}

	public static int decodeArray(int[] a) {
		int len = a.length;
		boolean isPositive = a[0] >= 0;
		int result = 0;
		for (int i = 0; i < len - 1; i++) {
			int digit = a[i] - a[i + 1];
			digit = digit > 0 ? digit : -digit;
			result = (result * 10) + digit;
		}
		if (isPositive) {
			return result;
		} else {
			return -result;
		}
	}
}
