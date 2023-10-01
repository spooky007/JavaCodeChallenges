package maharishi;

public class MadhavArray {

	public static void main(String[] args) {
		System.out.println(isMadhavArray(new int[] { 2, 1, 1 }));
		System.out.println(isMadhavArray(new int[] { 2, 1, 1, 4, -1, -1 }));
		System.out.println(isMadhavArray(new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 }));
		System.out.println(isMadhavArray(new int[] { 18, 9, 10, 6, 6, 6 }));
		System.out.println(isMadhavArray(new int[] { -6, -3, -3, 8, -5, -4 }));
		System.out.println(isMadhavArray(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 }));
		System.out.println(isMadhavArray(new int[] { 3, 1, 2, 3, 0 }));
	}

	public static int isMadhavArray(int[] a) {
		int len = a.length;
		int count = 2;
		if (len < 1) {
			return 0;
		}
		if (len == 1) {
			return 1;
		}
		int sum = a[0];
		for (int i = 1; i < a.length;) {
			int temp = 0;
			if (i + count > a.length) {
				return 0;
			}
			int k  = count;
			while (k > 0) {
				temp += a[i++];
				k--;
			}
			if (sum != temp) {
				return 0;
			}
			count++;
		}
		return 1;
	}
}
