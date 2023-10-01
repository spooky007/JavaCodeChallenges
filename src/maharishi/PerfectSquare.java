package maharishi;

public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(6));
		System.out.println(isPerfectSquare(36));
		System.out.println(isPerfectSquare(0));
		System.out.println(isPerfectSquare(-5));
	}
	
	public static int isPerfectSquare(int n) {
		int square = 0;
		if (n < 0) {
			return 0;
		}
		for (int i = 1; ; i++) {
			square = i * i;
			if (square > n) {
				break;
			}
		}
		return square;
	}
}
