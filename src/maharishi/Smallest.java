package maharishi;

public class Smallest {
	
	public int smallest(int n) {
		for (int i = 2; ;i++) {
			int[] multiples = getFirstXMultiples(i, n);
			boolean isSmallest = true;
			for (int j = 0; j < multiples.length; j++) {
				boolean found2 = false;
				int quotient = multiples[j];
				while (quotient != 0) {
					int remainder = quotient % 10;
					if (remainder == 2) {
						found2 = true;
						break;
					} else {
						quotient /= 10;
					}
				}
				if (found2 == false) {
					isSmallest = false;
					break;
				}
			}
			if (isSmallest) return i;
		}
	}
	
	public int[] getFirstXMultiples(int number, int x) {
		int[] multiples = new int[x];
		for (int i = 0, j = 1; i < x; i++, j++) {
			multiples[i] = number * j;
		}
		return multiples;
	}
}
