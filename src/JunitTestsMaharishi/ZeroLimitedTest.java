package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ZeroLimited;

class ZeroLimitedTest {

	@Test
	void test() {
		ZeroLimited zeroLimited = new ZeroLimited();
		int output1 = zeroLimited.isZeroLimited(new int[] { 1, 0, 5, -1, 0, 2, 3, 0, 8 });
		int output2 = zeroLimited.isZeroLimited(new int[] { 0, 0, 0, 0 });
		int output3 = zeroLimited.isZeroLimited(new int[] { 1, 0 });
		int output4 = zeroLimited.isZeroLimited(new int[] { 0, 1 });
		int output5 = zeroLimited.isZeroLimited(new int[] { 5 });
		int output6 = zeroLimited.isZeroLimited(new int[] { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0 });
		int output7 = zeroLimited.isZeroLimited(new int[] {});
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
		assertEquals(1, output7);
		
	}

}
