package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SameNumberOfFactors;

class SameNumberOfFactorsTest {

	@Test
	void test() {
		SameNumberOfFactors factors = new SameNumberOfFactors();
		int output1 = factors.sameNumberOfFactors(-6, 21);
		int output2 = factors.sameNumberOfFactors(6, 21);
		int output3 = factors.sameNumberOfFactors(8, 12);
		int output4 = factors.sameNumberOfFactors(23, 97);
		int output5 = factors.sameNumberOfFactors(0, 1);
		int output6 = factors.sameNumberOfFactors(0, 0);

		assertEquals(-1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(1, output6);
	}

}
