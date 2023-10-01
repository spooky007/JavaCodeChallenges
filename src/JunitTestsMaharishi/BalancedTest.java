package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Balanced;

class BalancedTest {

	@Test
	void test() {
		Balanced balanced = new Balanced();
		int output1 = balanced.isBalanced(new int[] { -2, 3, 2, -3 });
		int output2 = balanced.isBalanced(new int[] { -2, 2, -2, 2 });
		int output3 = balanced.isBalanced(new int[] { -5, 2, -2 });

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
	}

}
