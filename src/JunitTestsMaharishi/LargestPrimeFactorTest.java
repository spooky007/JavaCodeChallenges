package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.LargestPrimeFactor;

class LargestPrimeFactorTest {

	@Test
	void test() {
		LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
		int output1 = largestPrimeFactor.largestPrimeFactor(10);
		int output2 = largestPrimeFactor.largestPrimeFactor(6936);
		int output3 = largestPrimeFactor.largestPrimeFactor(1);

		assertEquals(5, output1);
		assertEquals(17, output2);
		assertEquals(0, output3);
	}

}
