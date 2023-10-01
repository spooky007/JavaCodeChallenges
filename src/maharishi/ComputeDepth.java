package maharishi;

public class ComputeDepth {
	
	public static void main(String[] args) {
		System.out.println(computeDepth(42));
		System.out.println(computeDepth(7));
		System.out.println(computeDepth(13));
		System.out.println(computeDepth(25));
	}

	public static int computeDepth(int n) {
		int[] arr = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int len = arr.length;
		int index = 0;
		int count = 0;
		int multiplyBy = 1;
		while (index <= 9) {
			int multiple = multiplyBy * n;
			count++;
			while (multiple != 0) {
				int remainder = multiple % 10;
				boolean found = false;
				for (int i = 0; i < len; i++) {
					if (arr[i] == remainder) {
						found = true;
						break;
					}
				}
				if (found == false) {
					arr[index] = remainder;
					if (index == 9) {
						return count;
					} else {
						index++;
					}
				}
				multiple /= 10;
			}
			multiplyBy++;
		}
		return count;
	}
}
