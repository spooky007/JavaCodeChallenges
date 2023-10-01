package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maharishi.LargestAdjacentSum;

class LargestAdjacentSumTest {

	@Test
	void test() {
		LargestAdjacentSum sum = new LargestAdjacentSum();
		int output1 = sum.largestAdjacentSum(new int[] {1, 2, 3, 4});
		int output2 = sum.largestAdjacentSum(new int[] {18, -12, 9, -10});
		int output3 = sum.largestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1});
		int output4 = sum.largestAdjacentSum(new int[] {1,1,1,1,1,2,1,1,1});
		
		assertEquals(7, output1);
		assertEquals(6, output2);
		assertEquals(2, output3);
		assertEquals(3, output4);
	}

}