package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CountDigit;

class CountDigitTest {

	@Test
	void test() {
		CountDigit count = new CountDigit();
		int output1 = count.countDigit(32121, 1);
		int output2 = count.countDigit(33331, 3);
		int output3 = count.countDigit(33331, 6);
		int output4 = count.countDigit(3, 3);
		
		assertEquals(2, output1);
		assertEquals(4, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
	}

}
