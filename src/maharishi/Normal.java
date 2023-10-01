package maharishi;

public class Normal {

	public static int isNormal(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && i % 2 == 1) {
				return 0;
			}
		}
		return 1;
	}
}
