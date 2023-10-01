package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SumFactor;

class SumFactorTest {

	@Test
	void test() {
		SumFactor sumfactor = new SumFactor();
		int output1 = sumfactor.sumFactor(new int[] { 3, 0, 2, -5, 0 });
		int output2 = sumfactor.sumFactor(new int[] { 9, -3, -3, -1, -1 });
		int output3 = sumfactor.sumFactor(new int[] { 1 });
		int output4 = sumfactor.sumFactor(new int[] { 0, 0, 0 });

		assertEquals(2, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(3, output4);
	}

}
