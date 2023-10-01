package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ZeroBalanced;

class ZeroBalancedTest {

	@Test
	void test() {
		ZeroBalanced balanced = new ZeroBalanced();
		int output1 = balanced.isZeroBalanced(new int[] { 1, 2, -2, -1 });
		int output2 = balanced.isZeroBalanced(new int[] { -3, 1, 2, -2, -1, 3 });
		int output3 = balanced.isZeroBalanced(new int[] { 3, 4, -2, -3, -2 });
		int output4 = balanced.isZeroBalanced(new int[] { 0, 0, 0, 0, 0, 0 });
		int output5 = balanced.isZeroBalanced(new int[] { 3, -3, -3 });
		int output6 = balanced.isZeroBalanced(new int[] { 3 });
		int output7 = balanced.isZeroBalanced(new int[] {});
		int output8 = balanced.isZeroBalanced(new int[] { 1, 2, 0, -1, -2 });

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
		assertEquals(0, output8);
	}

}
