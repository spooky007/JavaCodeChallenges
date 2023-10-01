package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Centered;

class CenteredTest {

	@Test
	void test() {
		Centered centered = new Centered();
		int output1 = centered.isCentered(new int[] { 5, 3, 3, 4, 5 });
		int output2 = centered.isCentered(new int[] { 3, 2, 1, 4, 5 });
		int output3 = centered.isCentered(new int[] { 3, 2, 1, 4, 1 });
		int output4 = centered.isCentered(new int[] { 3, 2, 1, 1, 4, 6 });
		int output5 = centered.isCentered(new int[] { 1 });
		
		assertEquals(0, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
	}

}
