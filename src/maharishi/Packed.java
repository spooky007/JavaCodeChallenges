package maharishi;

public class Packed {

	public static void main(String[] args) {
		System.out.println(isPacked(new int[] { 2, 2, 1 }));
		System.out.println(isPacked(new int[] { 2, 2, 1, 1, 2, 2 }));
		System.out.println(isPacked(new int[] { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 }));
		System.out.println(isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7, 1 }));
		System.out.println(isPacked(new int[] { 7, 7, 7, 7, 1, 7, 7, 7 }));
		System.out.println(isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7 }));
		System.out.println(isPacked(new int[] {}));
		System.out.println(isPacked(new int[] { 1, 2, 1 }));
		System.out.println(isPacked(new int[] { 2, 1, 1 }));
		System.out.println(isPacked(new int[] { -3, -3, -3 }));
		System.out.println(isPacked(new int[] { 0, 2, 2 }));
		System.out.println(isPacked(new int[] { 2, 1, 2 }));
	}

	public static int isPacked(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 1;
		}
		int next = 0;
		for (int i = 0; i < len; i = next) {
			if (a[i] <= 0) { 
				return 0;
			}
			int count = 0;
			int finalCount = a[i];
			int start = next;
			boolean nextChanged = false;  // this is to prevent changing next twice in 1 for loop
			int j;
			for (j = start; j < len; j++) {
				if (a[i] == a[j]) {
					count++;
				} else {
					if (count != finalCount) {
						return 0;
					}
					if (nextChanged == false) {
						next = j;
						nextChanged = true;
					}
				}
			}
			if (nextChanged == false) {     // this is to help break out of loop
				next = j + 1;
			}
			if (finalCount != count) {
				return 0;
			}
			if (i + finalCount == len - 1) {
				break;
			}
		}
		return 1;
	}
}
