package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.DualArray1;

class DualArray1Test {

	@Test
	void test() {
		DualArray1 dualArray = new DualArray1();
		int output1 = dualArray.isDual(new int[] { 1, 2, 3, 0 });
		int output2 = dualArray.isDual(new int[] { 1, 2, 2, 1, 3, 0 });
		int output3 = dualArray.isDual(new int[] { 1, 1, 2, 2 });
		int output4 = dualArray.isDual(new int[] { 1, 2, 1 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
	}

}
