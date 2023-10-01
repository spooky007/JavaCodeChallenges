package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FullnessQuotient;

class FullnessQuotientTest {

	@Test
	void test() {
		FullnessQuotient quotient = new FullnessQuotient();
		int output1 = quotient.fullnessQuotient(1);
		int output2 = quotient.fullnessQuotient(9);
		int output3 = quotient.fullnessQuotient(360);
		int output4 = quotient.fullnessQuotient(-4);

		assertEquals(8, output1);
		assertEquals(5, output2);
		assertEquals(0, output3);
		assertEquals(-1, output4);
	}

}
