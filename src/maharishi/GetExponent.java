package maharishi;

public class GetExponent {

	public static void main(String[] args) {
		System.out.println(getExponent(162, 3));
	}

	public static int getExponent(int n, int p) {
		if (p <= 1) {
			return -1;
		}
		int exponent = 0;
		int finalExponent = 0;
		while (power(p, exponent) <= n) {
			int result = power(p, exponent);
			if (n % result == 0) {
				finalExponent = exponent;
			}
			exponent++;
		}
		return finalExponent;
	}

	public static int power(int n, int x) {
		int result = 1;
		while (x > 0) {
			result *= n;
			x--;
		}
		return result;
	}
}
