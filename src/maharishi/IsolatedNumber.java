package maharishi;

public class IsolatedNumber {

	public static void main(String[] args) {
//		System.out.println(isIsolated(2909));
//		long cube = 2097151 * 2097151 * 2097151;
//		System.out.println(cube);
	}
	public static int isIsolated(long n) {
		if (n >= 2097151 || n < 1) {
			return -1;
		}
		long square = n * n;
		long cube = n * n * n;
		int[] squareDigits = intToArray(square);
		int[] cubeDigits = intToArray(cube);
		for (int i = 0; i < squareDigits.length; i++) {
			for (int j = 0; j < cubeDigits.length; j++) {
				if (squareDigits[i] == cubeDigits[j]) {
					return 0;
				}
			}
		}
		return 1;
	}
	
	public static int[] intToArray(long n) {
		int size = 0;
		int i = (int) n;
		while (i > 0) {
			i /= 10;
			size++;
		}
		int[] arr = new int[size];
		int index = 0;
		while (n > 0) {
			int remainder = (int)(n) % 10;
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
