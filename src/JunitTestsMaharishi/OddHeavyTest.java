package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.OddHeavy;

class OddHeavyTest {

	@Test
	void test() {
		OddHeavy oddHeavy = new OddHeavy();
		int output1 = oddHeavy.isOddHeavy(new int[] { 1 });
		int output2 = oddHeavy.isOddHeavy(new int[] { 2 });
		int output3 = oddHeavy.isOddHeavy(new int[] { 1, 1, 1, 1, 1, 1, 1 });
		int output4 = oddHeavy.isOddHeavy(new int[] { 2, 4, 6, 8, 11 });
		int output5 = oddHeavy.isOddHeavy(new int[] { -2, -4, -6, -8, -11 });
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}

}
