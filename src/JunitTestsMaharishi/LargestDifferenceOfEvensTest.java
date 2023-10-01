package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.LargestDifferenceOfEvens;

class LargestDifferenceOfEvensTest {

	@Test
	void test() {
		LargestDifferenceOfEvens difference = new LargestDifferenceOfEvens();
		int output1 = difference.largestDifferenceOfEvens(new int[] { 1, 3, 5, 9 });
		int output2 = difference.largestDifferenceOfEvens(new int[] { 1, 18, 5, 7, 33 });
		int output3 = difference.largestDifferenceOfEvens(new int[] { 2, 2, 2, 2 });
		int output4 = difference.largestDifferenceOfEvens(new int[] { 1, 2, 1, 2, 1, 4, 1, 6, 4 });

		assertEquals(-1, output1);
		assertEquals(-1, output2);
		assertEquals(0, output3);
		assertEquals(4, output4);
	}

}
