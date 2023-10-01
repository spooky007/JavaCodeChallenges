package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.PairedN;

class PairedNTest {

	@Test
	void test() {
		PairedN paired = new PairedN();
		int output1 = paired.isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 5);
		int output2 = paired.isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 6);
		int output3 = paired.isPairedN(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}, 6);
		int output4 = paired.isPairedN(new int[] {1, 4, 1} , 5);
		int output5 = paired.isPairedN(new int[] {8, 8, 8, 8, 7, 7, 7} , 15);
		int output6 = paired.isPairedN(new int[] {8, -8, 8, 8, 7, 7, -7}, -15);
		int output7 = paired.isPairedN(new int[] { 3 }, 3);
		int output8 = paired.isPairedN(new int[] {}, 0);

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
		assertEquals(0, output8);
	}

}
