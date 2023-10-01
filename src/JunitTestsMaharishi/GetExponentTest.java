package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.GetExponent;

class GetExponentTest {

	@Test
	void test() {
		GetExponent exponent = new GetExponent();
		int output1 = exponent.getExponent(162, 3);
		int output2 = exponent.getExponent(27, 3);
		int output3 = exponent.getExponent(8, 3);
		int output4 = exponent.getExponent(280, 7);
		int output5 = exponent.getExponent(250, 5);
		int output6 = exponent.getExponent(18, 1);
		int output7 = exponent.getExponent(128, 4);

		assertEquals(4, output1);
		assertEquals(3, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(3, output5);
		assertEquals(-1, output6);
		assertEquals(3, output7);
	}

}
