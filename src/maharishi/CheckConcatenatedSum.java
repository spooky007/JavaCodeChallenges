package maharishi;

public class CheckConcatenatedSum {
	
	public static void main(String[] args) {
		System.out.println(concatenate(7, 9));
	}

	public static int checkConcatenatedSum(int n, int catlen) {
		int quotient = n;
		int sum = 0;
		while (quotient != 0) {
			int remainder = quotient % 10;
			sum += concatenate(remainder, catlen);
			quotient /= 10;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int concatenate(int n, int catlen) {
		int result = n;
		while (catlen > 1) {
			result = (result * 10) + n;
			catlen--;
		}
		return result;
	}
}
