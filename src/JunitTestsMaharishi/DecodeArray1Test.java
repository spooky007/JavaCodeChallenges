package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.DecodeArray1;

class DecodeArray1Test {

	@Test
	void test() {
		DecodeArray1 decodeArray = new DecodeArray1();
		int output1 = decodeArray.decodeArray(new int[] { 1 });
		int output2 = decodeArray.decodeArray(new int[] { 0, 1 });
		int output3 = decodeArray.decodeArray(new int[] { -1, 0, 1 });
		int output4 = decodeArray.decodeArray(new int[] { 0, 1, 1, 1, 1, 1, 0, 1 });
		int output5 = decodeArray.decodeArray(
				new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 });
		
		assertEquals(0, output1);
		assertEquals(1, output2);
		assertEquals(-1, output3);
		assertEquals(100001, output4);
		assertEquals(999, output5);
	}
}
