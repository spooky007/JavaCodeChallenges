package maharishi;

public class Evens {

	public static int isEvens(int n) {
		while (n != 0) {
			int remainder = n % 10;
			if (remainder % 2 != 0) {
				return 0;
			}
			n /= 10;
		}
		return 1;
	}
}
