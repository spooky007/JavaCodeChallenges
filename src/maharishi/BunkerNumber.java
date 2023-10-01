package maharishi;

public class BunkerNumber {

	public static int isBunker(int n) {
		int count = 1;
		int number = 1;
		for (int i = 1; number < n; i++) {
			number += i;
		}
		if (number == n) {
			return 1;
		}
		return 0;
	}
}
