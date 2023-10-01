package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.GutherieSequence;

class GutherieSequenceTest {

	@Test
	void test() {
		GutherieSequence gutherie = new GutherieSequence();
		int output1 = gutherie.isGutherieSequence(
				new int[] { 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 });
		int output2 = gutherie.isGutherieSequence(new int[] { 8, 4, 2, 1});
		int output3 = gutherie.isGutherieSequence(new int[] { 8, 17, 4, 1});
		int output4 = gutherie.isGutherieSequence(new int[] { 8, 4, 1});
		int output5 = gutherie.isGutherieSequence(new int[] { 8, 4, 2});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		
	}

}
