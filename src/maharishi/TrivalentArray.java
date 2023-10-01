package maharishi;

public class TrivalentArray {

	public static int isTrivalent(int[] a) {
		int len = a.length;
		if (len < 3) {
			return 0;
		}
		int initial = Integer.MIN_VALUE;
		int[] numbers = {initial, initial, initial, initial };
		int index = 0;
		for (int i = 0; i < len; i++) {
			boolean found = false;
			for (int j = 0; j < index; j++) {
				if (a[i] == numbers[j]) {
					found = true;
					break;
				}
			}
			if (found == false) {
				if (index < 3) {
					numbers[index++] = a[i];
				} else {
					return 0;
				}
			}
		}
		if (index == 3) {
			return 1;
		} else {
			return 0;
		}
	}
}
