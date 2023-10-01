package maharishi;

public class ZeroPlentiful {

	public static int isZeroPlentiful(int[] a) {
		int len = a.length;
		boolean zeroFlag = false;
		int noSequence = 0;
		int zeroCount = 0;    // tracks the number of zeroes
		boolean counter = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				zeroFlag = true;
				counter = true;
				zeroCount++;
			}
			
			if (a[i] != 0 || i == len - 1) {
				if (counter == true) {
					if (zeroCount < 4) {
						return 0;
					} else {
						noSequence++;
					}
					counter = false;
					zeroCount = 0;
				} else {
					continue;
				}
			}
		}
		if (zeroFlag) {
			return noSequence;
		} else {
			return 0;
		}
	}
}
