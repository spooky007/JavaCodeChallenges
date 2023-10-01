package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import maharishi.EncodeArray;

class EncodeArrayTest {

	@Test
	void test() {
		EncodeArray encodedArray = new EncodeArray();
		int[] output1 = encodedArray.encodeArray(0);
		int[] output2 = encodedArray.encodeArray(1);
		int[] output3 = encodedArray.encodeArray(-1);
		int[] output4 = encodedArray.encodeArray(100001);
		int[] output5 = encodedArray.encodeArray(999);

		assertArrayEquals(new int[] { 1 }, output1);
		assertArrayEquals(new int[] { 0, 1 }, output2);
		assertArrayEquals(new int[] { -1, 0, 1 }, output3);
		assertArrayEquals(new int[] { 0, 1, 1, 1, 1, 1, 0, 1 }, output4);
		assertArrayEquals(new int[] { 0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1 }, output5);
	}
}
