package maharishi;

public class IsSquare {

	public static int isSquare(int n) {
		if (n < 0) {
			return 0;
		}
		for (int i = 0; i <= n; i++) {
			if (i * i == n) {
				return 1;
			}
		}
		return 0;
	}
}
