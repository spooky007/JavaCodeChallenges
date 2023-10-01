package maharishi;

public class ConvertToBase10 {
	public static void main(String[] args) {
//		System.out.println(power(3, 0));
		System.out.println(convertToBase10(new int[ ] {1, 0, 1, 1}, 2));
		System.out.println(convertToBase10(new int[ ] {1, 1, 2}, 3));
		System.out.println(convertToBase10(new int[ ] {3, 2, 5}, 8));
		System.out.println(convertToBase10 (new int[ ] {3, 7, 1}, 6));
	}

	public static int convertToBase10(int[] a, int base) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= base) {
				return -1;
			}
		}
		int sum = 0;
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			sum += a[i] * power(base, j); 
		}
		return sum;
	}
	
	public static int power(int n, int power) {
		int result = 1;
		while (power > 0) {
			result *= n;
			power--;
		}
		return result;
	}
}
