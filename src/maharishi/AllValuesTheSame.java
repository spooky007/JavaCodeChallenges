package maharishi;

public class AllValuesTheSame {

	public static int AllValuesTheSame(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		for (int i = 0; i < len - 1; i++) {
			if (a[i] != a[i + 1]) {
				return 0;
			}
		}
		return 1;
	}
}
