package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CheckConcatenatedSum;

class CheckConcatenatedSumTest {

	@Test
	void test() {
		CheckConcatenatedSum concatSum = new CheckConcatenatedSum();
		int output1 = concatSum.checkConcatenatedSum(198, 2);
		int output2 = concatSum.checkConcatenatedSum(198, 3);
		int output3 = concatSum.checkConcatenatedSum(2997, 3);
		int output4 = concatSum.checkConcatenatedSum(2997, 2);
		int output5 = concatSum.checkConcatenatedSum(13332, 4);
		int output6 = concatSum.checkConcatenatedSum(9, 1);
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
	}

}
