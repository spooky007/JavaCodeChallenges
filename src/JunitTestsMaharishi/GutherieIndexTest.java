package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.GutherieIndex;

class GutherieIndexTest {

	@Test
	void test() {
		GutherieIndex index = new GutherieIndex();
		int output1 = index.gutherieIndex(1);
		int output2 = index.gutherieIndex(2);
		int output3 = index.gutherieIndex(3);
		int output4 = index.gutherieIndex(4);
		int output5 = index.gutherieIndex(42);
		
		assertEquals(0, output1);
		assertEquals(1, output2);
		assertEquals(7, output3);
		assertEquals(2, output4);
		assertEquals(8, output5);
	}

}
