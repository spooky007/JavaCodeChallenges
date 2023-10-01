package maharishi;

public class Power {

	public static int power(int n, int power) {
		int result = 1;
		while (power > 0) {
			result *= n;
			power--;
		}
		return result;
	}
}
