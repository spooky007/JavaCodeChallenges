package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ZeroPlentiful;

class ZeroPlentifulTest {

	@Test
	void test() {
		ZeroPlentiful zero = new ZeroPlentiful();
		int output1 = zero.isZeroPlentiful(new int[] { 0, 0, 0, 0, 0 });
		int output2 = zero.isZeroPlentiful(new int[] {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12});
		int output3 = zero.isZeroPlentiful(new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0 });
		int output4 = zero.isZeroPlentiful(new int[] { 1, 2, 3, 4 });
		int output5 = zero.isZeroPlentiful(new int[] { 1, 0, 0, 0, 2, 0, 0, 0, 0 });
		int output6 = zero.isZeroPlentiful(new int[] { 0 });
		int output7 = zero.isZeroPlentiful(new int[] {});
		
		assertEquals(1, output1);
		assertEquals(2, output2);
		assertEquals(3, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
	}
}
