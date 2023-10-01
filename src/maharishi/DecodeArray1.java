package maharishi;

public class DecodeArray1 {

	public static void main(String[] args) {
//		System.out.println(decodeArray(new int[] {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
	} 
	
	public static int decodeArray(int[] a) {
		int len = a.length;
		int start = 0;
		int decodedNumber = 0;
		if (a[0] == -1) {
			start = 1;
		}
		int count = 0;
		for (int i = start; i < len; i++) {
			if (a[i] == 1) {
				decodedNumber = (decodedNumber * 10) + count;
				count = 0;
			} else {
				count++;
			}
		}
		if (start == 1) {
			return -decodedNumber;
		} else {
			return decodedNumber;
		}
	}
}
