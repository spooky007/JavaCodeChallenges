package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.OneBalanced;

class OneBalancedTest {

	@Test
	void test() {
		OneBalanced balanced = new OneBalanced();
		int output1 = balanced.isOneBalanced(new int[] {1, 1, 1, 2, 3, -18, 45, 1});
		int output2 = balanced.isOneBalanced(new int[] {1, 1, 1, 2, 3, -18, 45, 1, 0});
		int output3 = balanced.isOneBalanced(new int[] {1, 1, 2, 3, 1, -18, 26, 1} );
		int output4 = balanced.isOneBalanced(new int[] {});
		int output5 = balanced.isOneBalanced(new int[] {3, 4, 1, 1});
		int output6 = balanced.isOneBalanced(new int[] {1, 1, 3, 4});
		int output7 = balanced.isOneBalanced(new int[] {3, 3, 3, 3, 3, 3} );
		int output8 = balanced.isOneBalanced(new int[] {1, 1, 1, 1, 1, 1} );
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
		assertEquals(0, output7);
		assertEquals(0, output8);
	}

}
