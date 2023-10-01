package maharishi;

public class DigitalIncreasing {

	public static void main(String[] args) {
//		System.out.println(isDigitalIncreasing(7));
//		System.out.println(isDigitalIncreasing(36));
//		System.out.println(isDigitalIncreasing(984));
//		System.out.println(isDigitalIncreasing(7404));
	}

	public static int isDigitalIncreasing(int n) {
		for (int i = 1; i <= 9; i++) {
			int sum = 0;
			int num = 0;
			while (sum < n) {
				sum += num;
				num = (num * 10) + i;
			}
			if (sum == n) {
				return 1;
			}
		}
		return 0;
	}
}
