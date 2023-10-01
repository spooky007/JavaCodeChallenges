package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.HasKSmallFactors;

class HasKSmallFactorsTest {

	@Test
	void test() {
		HasKSmallFactors factors = new HasKSmallFactors();
		boolean output1 = factors.hasKSmallFactors(7, 30);
		boolean output2 = factors.hasKSmallFactors(6, 14);
		boolean output3 = factors.hasKSmallFactors(6, 30);
//		boolean output4 = factors.hasKSmallFactors(7, 30);
		
		assertEquals(true, output1);
		assertEquals(false, output2);
		assertEquals(false, output3);
	}

}
