package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FactorialPrime;

class FactorialPrimeTest {

	@Test
	void test() {
		FactorialPrime factorialPrime = new FactorialPrime();
		int output1 = factorialPrime.isFactorialPrime(2);
		int output2 = factorialPrime.isFactorialPrime(3);
		int output3 = factorialPrime.isFactorialPrime(7);
		int output4 = factorialPrime.isFactorialPrime(8);
		int output5 = factorialPrime.isFactorialPrime(11);
		int output6 = factorialPrime.isFactorialPrime(721);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
