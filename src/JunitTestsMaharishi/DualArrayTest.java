package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.DualArray;

class DualArrayTest {

	@Test
	void test() {
		DualArray dual = new DualArray();
		int output1 = dual.isDual(new int[] {1, 2, 1, 3, 3, 2});
		int output2 = dual.isDual(new int[] {2, 5, 2, 5, 5});
		int output3 = dual.isDual(new int[] {3, 1, 1, 2, 2});
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
	}
}
