package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FactorEqual;

class FactorEqualTest {

	@Test
	void test() {
		FactorEqual factorEqual = new FactorEqual();
		int output1 = factorEqual.factorEqual(10, 33);
		int output2 = factorEqual.factorEqual(9, 10);

		assertEquals(1, output1);
		assertEquals(0, output2);
	}

}
