package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.BunkerArray;

class BunkerArrayTest {

	@Test
	void test() {
		BunkerArray bunker = new BunkerArray();
		int output1 = bunker.isBunkerArray(new int[] { 4, 9, 6, 7, 3 });
		int output2 = bunker.isBunkerArray(new int[] { 4, 9, 6, 15, 21 });

		assertEquals(1, output1);
		assertEquals(0, output2);
	}
}
