package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.PrimeHappy;

class PrimeHappyTest {

	@Test
	void test() {
		PrimeHappy primeHappy = new PrimeHappy();
		int output1 = primeHappy.isPrimeHappy(5);
		int output2 = primeHappy.isPrimeHappy(25);
		int output3 = primeHappy.isPrimeHappy(32);
		int output4 = primeHappy.isPrimeHappy(8);
		int output5 = primeHappy.isPrimeHappy(2);

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
	}

}
