package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.DigitSum;

class DigitSumTest {

	@Test
	void test() {
		DigitSum digitSum = new DigitSum();
		int output1 = digitSum.isDigitSum(32121, 10);
		int output2 = digitSum.isDigitSum(32121, 9);
		int output3 = digitSum.isDigitSum(13, 6);
		int output4 = digitSum.isDigitSum(3, 3);
		int output5 = digitSum.isDigitSum(-543, 3);

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output4);
	}

}
