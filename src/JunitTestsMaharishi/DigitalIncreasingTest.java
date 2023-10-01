package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.DigitalIncreasing;

class DigitalIncreasingTest {

	@Test
	void test() {
		DigitalIncreasing digIncreasing = new DigitalIncreasing();
		int output1 = digIncreasing.isDigitalIncreasing(7);
		int output2 = digIncreasing.isDigitalIncreasing(36);
		int output3 = digIncreasing.isDigitalIncreasing(984);
		int output4 = digIncreasing.isDigitalIncreasing(7404);
		int output5 = digIncreasing.isDigitalIncreasing(7400);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}

}
