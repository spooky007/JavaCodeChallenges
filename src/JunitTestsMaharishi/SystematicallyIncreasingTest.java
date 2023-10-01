package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SystematicallyIncreasing;

class SystematicallyIncreasingTest {

	@Test
	void test() {
		SystematicallyIncreasing sysIncrease = new SystematicallyIncreasing();
		int output1 = sysIncrease.isSystematicallyIncreasing(new int[] { 1 });
		int output2 = sysIncrease.isSystematicallyIncreasing(new int[] { 1, 2, 1, 2, 3 });
		int output3 = sysIncrease.isSystematicallyIncreasing(new int[] { 1, 1, 3 });
		int output4 = sysIncrease.isSystematicallyIncreasing(new int[] { 1, 2, 1, 2, 1, 2 });
		int output5 = sysIncrease.isSystematicallyIncreasing(new int[] { 1, 2, 3, 1, 2, 1 });
		int output6 = sysIncrease.isSystematicallyIncreasing(new int[] { 1, 1, 2, 3 });

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);

	}

}
