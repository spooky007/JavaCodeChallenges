package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.PrimeProduct;

class PrimeProductTest {

	@Test
	void test() {
		PrimeProduct prime = new PrimeProduct();
		int output1 = prime.isPrimeProduct(22);
		int output2 = prime.isPrimeProduct(15);
		int output3 = prime.isPrimeProduct(12);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
	}

}
