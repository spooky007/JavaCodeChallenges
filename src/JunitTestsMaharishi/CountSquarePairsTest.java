package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CountSquarePairs;

class CountSquarePairsTest {

	@Test
	void test() {
		CountSquarePairs pairs = new CountSquarePairs();
		int output1 = pairs.countSquarePairs(new int[] { 9, 0, 2, -5, 7 });
		int output2 = pairs.countSquarePairs(new int[] { 9 });

		assertEquals(2, output1);
		assertEquals(0, output2);
	}

}
