package maharishi;

public class CountOnes {

	public static int countOnes(int n) {
		int count = 0;
		while (n != 0) {
			int remainder = n % 2;
			if (remainder == 1) {
				count++;
			}
			n /= 2;
		}
		return count;
	}
}
