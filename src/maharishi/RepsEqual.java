package maharishi;

public class RepsEqual {
	
	public static void main(String[] args) {
		System.out.println(repsEqual(new int[] {0, 3, 2, 0, 5, 3}, 32053));
	}

	public static int repsEqual(int[] a, int n) {
		for (int i = a.length - 1; i >= 0; i--) {
			int remainder = n % 10;
			if (a[i] != remainder) {
				return 0;
			}
			n /= 10;
		}
		return 1;
	}
}
