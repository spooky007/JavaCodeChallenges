package maharishi;

public class GutherieIndex {
	
	public static void main(String[] args) {
		System.out.println(gutherieIndex(42));
	}

	public static int gutherieIndex(int n) {
		int index = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (n * 3) + 1;
			}
			index++;
		}
		return index;
	}
}
