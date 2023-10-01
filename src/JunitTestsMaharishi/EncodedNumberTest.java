package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import maharishi.EncodedNumber;

class EncodedNumberTest {

	@Test
	void test() {
		EncodedNumber encodedNumber = new EncodedNumber();
		int[] output1 = encodedNumber.encodedNumber(2);
		int[] output2 = encodedNumber.encodedNumber(6);
		int[] output3 = encodedNumber.encodedNumber(14);
		int[] output4 = encodedNumber.encodedNumber(24);
		int[] output5 = encodedNumber.encodedNumber(1200);
		int[] output6 = encodedNumber.encodedNumber(1);
		int[] output7 = encodedNumber.encodedNumber(-18);
		
		assertArrayEquals(new int[] {2}, output1);
		assertArrayEquals(new int[] {2, 3}, output2);
		assertArrayEquals(new int[] {2, 7}, output3);
		assertArrayEquals(new int[] {2, 2, 2, 3}, output4);
		assertArrayEquals(new int[] {2, 2, 2, 2, 3, 5, 5}, output5);
		assertArrayEquals(null, output6);
		assertArrayEquals(null, output7);
 	}

}
