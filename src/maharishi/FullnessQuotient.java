package maharishi;

public class FullnessQuotient {
	
	public static void main(String[] args) {
		System.out.println(fullnessQuotient(-4));
	}

	public static int fullnessQuotient(int n) {
		int count = 0;
		if (n < 0) {
			return -1;
		}
		for (int i = 2; i <= 9; i++) {
			int quotient = n;
			boolean foundZero = false;
			while (quotient != 0) {
				int remainder = quotient % i;
				if (remainder == 0) {
					foundZero = true;
					break;
				}
				quotient /= i;
			}
			if (foundZero == false) {
				count++;
			}
		}
		return count;
	}
}
