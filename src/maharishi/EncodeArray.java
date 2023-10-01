package maharishi;

public class EncodeArray {

	public static int[] encodeArray(int n) {
		boolean negative = n < 0;
		int quotient = n > 0 ? n : -n;
		int arrayLength = 0;
		int begin = 0;
		if (n == 0) {
			arrayLength = 1;
		}
		while (quotient != 0) {
			int remainder = quotient % 10;
			arrayLength += remainder + 1; // number of zeroes + 1
			quotient /= 10;
		}
		if (negative) {
			arrayLength++;
			begin = 1; // start from index 1 since zero index is occupied by the sign digit 
		}
		int[] encodedArray = new int[arrayLength];
		if (negative) {
			encodedArray[0] = -1;
		}
		quotient = n > 0 ? n : -n;
		for (int i = arrayLength - 1; i >= begin;) {
			int remainder = quotient % 10;
			encodedArray[i--] = 1;
			while (remainder > 0) {
				encodedArray[i--] = 0;
				remainder--;
			}
			if (quotient != 0) {
				quotient /= 10;
			} else {
				break;
			}
		}
		return encodedArray;
	}
}
