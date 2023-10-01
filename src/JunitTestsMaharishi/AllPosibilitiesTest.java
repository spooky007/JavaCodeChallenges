package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.AllPosibilities;

class AllPosibilitiesTest {

	@Test
	void test() {
		AllPosibilities possibilities = new AllPosibilities();
		int output1 = possibilities.isAllPosibilities(new int[] { 1, 2, 0, 3 });
		int output2 = possibilities.isAllPosibilities(new int[] { 3, 2, 1, 0 });
		int output3 = possibilities.isAllPosibilities(new int[] { 1, 2, 4, 3 });
		int output4 = possibilities.isAllPosibilities(new int[] { 0, 2, 3 });
		int output5 = possibilities.isAllPosibilities(new int[] { 0 });
		int output6 = possibilities.isAllPosibilities(new int[] {});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
		assertEquals(0, output6);
	}

}
