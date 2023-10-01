package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.TwinPrime;

class TwinPrimeTest {

	@Test
	void test() {
		TwinPrime twinPrime = new TwinPrime();
		int output1 = twinPrime.isTwinPrime(5);
		int output2 = twinPrime.isTwinPrime(7);
		int output3 = twinPrime.isTwinPrime(53);
		int output4 = twinPrime.isTwinPrime(9);

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
	}

}
