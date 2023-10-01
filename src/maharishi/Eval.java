package maharishi;

public class Eval {

	public static double eval(double x, int[] a) {
		int len = a.length;
		double sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i] * power(x, i);
		}
		return sum;
	}
	
	public static int power(double num, int power) {
		int result = 1;
		while (power > 0) {
			result *= num;
			power--;
		}
		return result;
	}
}
