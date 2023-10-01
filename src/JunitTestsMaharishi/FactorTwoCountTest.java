package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FactorTwoCount;

class FactorTwoCountTest {

	@Test
	void test() {
		FactorTwoCount factor = new FactorTwoCount();
		int output1 = factor.factorTwoCount(48);
		int output2 = factor.factorTwoCount(24);
		int output3 = factor.factorTwoCount(12);
		int output4 = factor.factorTwoCount(27);
		
		assertEquals(4, output1);
		assertEquals(3, output2);
		assertEquals(2, output3);
		assertEquals(0, output4);
	}

}
