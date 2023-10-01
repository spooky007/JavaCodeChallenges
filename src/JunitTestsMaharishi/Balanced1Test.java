package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Balanced1;

class Balanced1Test {

	@Test
	void test() {
		Balanced1 balanced = new Balanced1();
		int output1 = balanced.isBalanced(new int[] { 2, 3, 6, 7 });
		int output2 = balanced.isBalanced(new int[] { 6, 7, 2, 3, 12 });
		int output3 = balanced.isBalanced(new int[] {7, 15, 2, 3});
		int output4 = balanced.isBalanced(new int[] {16, 6, 2, 3});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
	}

}
