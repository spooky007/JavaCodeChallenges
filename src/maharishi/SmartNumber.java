package maharishi;

public class SmartNumber {

	public static int isSmart(int n) {
		int counter = 1;
		int number = 0;
		int previous = 1;
		while (number < n) {
			number = previous + counter;
			previous = number;
			counter++;
		}
		if (number == n) {
			return 1;
		} else {
			return 0;
		}
		
	}
}
