package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.BunkerNumber;

class BunkerNumberTest {

	@Test
	void test() {
		BunkerNumber bunker = new BunkerNumber();
		int output1 = bunker.isBunker(1);
		int output2 = bunker.isBunker(4);
		int output3 = bunker.isBunker(7);
		int output4 = bunker.isBunker(16);
		int output5 = bunker.isBunker(20);
		int output6 = bunker.isBunker(21);
		int output7 = bunker.isBunker(25);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
	}
}
