package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.DecodeArray;

class DecodeArrayTest {

	@Test
	void test() {
		DecodeArray decodeArray = new DecodeArray();
		int output1 = decodeArray.decodeArray(new int[] { 0, -3, 0, -4, 0 });
		int output2 = decodeArray.decodeArray(new int[] {-1, 5, 8, 17, 15});
		int output3 = decodeArray.decodeArray(new int[] {1, 5, 8, 17, 15} );
		int output4 = decodeArray.decodeArray(new int[] {111, 115, 118, 127, 125});
		int output5 = decodeArray.decodeArray(new int[] { 1, 1 });
		
		assertEquals(3344, output1);
		assertEquals(-6392, output2);
		assertEquals(4392, output3);
		assertEquals(4392, output4);
		assertEquals(0, output5);
	}

}
