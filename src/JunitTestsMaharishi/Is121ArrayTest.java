package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Is121Array;

class Is121ArrayTest {

	@Test
	void test() {
		Is121Array is121Array = new Is121Array();
		int output1 = is121Array.is121Array(new int[] { 1, 2, 1 });
		int output2 = is121Array.is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1 });
		int output3 = is121Array.is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1, 1 });
		int output4 = is121Array.is121Array(new int[] { 1, 1, 2, 1, 2, 1, 1 });
		int output5 = is121Array.is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 });
		int output6 = is121Array.is121Array(new int[] { 1, 1, 1, 1, 1, 1 });
		int output7 = is121Array.is121Array(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 });
		int output8 = is121Array.is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2 });
		int output9 = is121Array.is121Array(new int[] { 2, 2, 2 });

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
		assertEquals(0, output8);
		assertEquals(0, output9);
	}

}
