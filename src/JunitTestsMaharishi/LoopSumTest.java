package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.LoopSum;

class LoopSumTest {

	@Test
	void test() {
		LoopSum loopSum = new LoopSum();
		int output1 = loopSum.loopSum(new int[] {1, 2, 3}, 2);
		int output2 = loopSum.loopSum(new int[] { -1, 2, -1 }, 7);
		int output3 = loopSum.loopSum(new int[] { 1, 4, 5, 6 }, 4);
		int output4 = loopSum.loopSum(new int[] { 3 }, 10);

		assertEquals(3, output1);
		assertEquals(-1, output2);
		assertEquals(16, output3);
		assertEquals(30, output4);
	}

}
