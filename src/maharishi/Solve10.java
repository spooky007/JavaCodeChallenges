package maharishi;

import java.util.Arrays;

public class Solve10 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solve10()));
//		System.out.println(factorial(10));
	}

	public static int[] solve10() {
		int factorial10 = factorial(10);
		int i = 0;
		int j = 0;
		int sum = factorial(i) + factorial(j);
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				sum = factorial(i) + factorial(j);
				if (sum == factorial10) {
					break;
				}
			}
		}
		if ( i == 10 && j == 10) {
			i = 0;
			j = 0;
		}
		return new int[] { i, j };

	}

	public static int factorial(int n) {
		int factorial = 1;
		while (n > 0) {
			factorial *= n;
			n--;
		}
		return factorial;
	}
}
