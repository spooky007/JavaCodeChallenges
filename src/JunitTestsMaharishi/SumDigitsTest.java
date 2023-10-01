package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SumDigits;

class SumDigitsTest {

	@Test
	void test() {
		SumDigits sum = new SumDigits();
		int output1 = sum.SumDigits(3114);
		int output2 = sum.SumDigits(-6543);
		int output3 = sum.SumDigits(0);

		assertEquals(9, output1);
		assertEquals(18, output2);
		assertEquals(0, output3);
	}

}
