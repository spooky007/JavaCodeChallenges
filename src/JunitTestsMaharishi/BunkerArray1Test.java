package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.BunkerArray1;

class BunkerArray1Test {

	@Test
	void test() {
		BunkerArray1 bunker = new BunkerArray1();
		int output1 = bunker.isBunker(new int[] { 7, 6, 10, 1 });
		int output2 = bunker.isBunker(new int[] { 7, 6, 10 });
		int output3 = bunker.isBunker(new int[] { 6, 10, 1 });

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
	}

}
