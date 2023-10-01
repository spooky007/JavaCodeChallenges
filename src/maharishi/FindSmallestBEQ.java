package maharishi;

public class FindSmallestBEQ {
	public static void main(String[] args) {
		System.out.println(findSmallestBEQ());
	}
	
	public static int findSmallestBEQ() {
		int i = 4;
		for (i = 1; ; i++) {
			int quotient = i * i * i;
			int count = 0;
			while (quotient != 0) {
				int remainder = quotient % 10;
				if (remainder == 6) {
					count++;
				}
				quotient /= 10;
			}
			if (count == 4) {
				break;
			}
		}
		return i;
	}

}
