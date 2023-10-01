package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maharishi.PairwiseSum;

class PairwiseSumTest {

	@Test
	void test() {
		PairwiseSum pairSum = new PairwiseSum();
		int[] output1 = pairSum.pairwiseSum(new int[] { 2, 1, 18, -5 });
		int[] output2 = pairSum.pairwiseSum(new int[] { 2, 1, 18, -5, -5, -15, 0, 0, 1, -1 });
		int[] output3 = pairSum.pairwiseSum(new int[] { 2, 1, 18 });
		int[] output4 = pairSum.pairwiseSum(new int[] {});

		assertArrayEquals(new int[] { 3, 13 }, output1);
		assertArrayEquals(new int[] { 3, 13, -20, 0, 0 }, output2);
		assertArrayEquals(null, output3);
		assertArrayEquals(null, output4);
	}

}
