package maharishi;

public class SequentiallyBoundedArray {
	
	public static void main(String[] args) {
		System.out.println(isSequentiallyBounded(new int[] {0, 1}));
		System.out.println(isSequentiallyBounded(new int[] {-1, 2}));
		System.out.println(isSequentiallyBounded(new int[] {}));
		System.out.println(isSequentiallyBounded(new int[] {5, 5, 5, 5}));
		System.out.println(isSequentiallyBounded(new int[] {5, 5, 5, 2, 5}));
	}

	public static int isSequentiallyBounded(int[] a) {
		int len = a.length;
		if (len == 0) return 1;
		for (int i = 0; i < len; i++) {
			if (a[i] < 2) {
				return 0;
			}
			if ( i != 0 && a[i] < a[i - 1]) {
				return 0;
			}
		}
		int max = a[0] - 1;
		int counter = 0;
		for (int i = 1; i < len; i++) {
			if (a[i] == a[i - 1]) {
				counter++;
			}
			if (a[i] > a[i - 1]) {
				max = a[i] - 1;
				counter = 0;
			}
			if (counter > max) {
				return 0;
			}
		}
		return 1;
	}
}
