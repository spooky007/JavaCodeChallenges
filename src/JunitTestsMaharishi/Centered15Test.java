package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Centered15;

class Centered15Test {

	@Test
	void test() {
		Centered15 centered15 = new Centered15();
		int output1 = centered15.isCentered15(new int[] {3, 2, 10, 4, 1, 6, 9});
		int output2 = centered15.isCentered15(new int[] {2, 10, 4, 1, 6, 9});
		int output3 = centered15.isCentered15(new int[] {3, 2, 10, 4, 1, 6});
		int output4 = centered15.isCentered15(new int[] {1,1,8, 3, 1, 1});
		int output5 = centered15.isCentered15(new int[] { 9, 15, 16});
		int output6 = centered15.isCentered15(new int[] {1, 1, 2, 2, 1, 1} );
		int output7 = centered15.isCentered15(new int[] {1, 1, 15 -1,-1});
	
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(0, output6);
		assertEquals(1, output7);
	}

}
