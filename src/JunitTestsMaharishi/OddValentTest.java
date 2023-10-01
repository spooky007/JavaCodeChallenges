package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.OddValent;

class OddValentTest {

	@Test
	void test() {
		OddValent oddValent = new OddValent();
		int output1 = oddValent.isOddValent(new int[] { 9, 3, 4, 9, 1 });
		int output2 = oddValent.isOddValent(new int[] { 3, 3, 3, 3 });
		int output3 = oddValent.isOddValent(new int[] { 8, 8, 8, 4, 4, 7, 2 });
		int output4 = oddValent.isOddValent(new int[] { 1, 2, 3, 4, 5 });
		int output5 = oddValent.isOddValent(new int[] { 2, 2, 2, 4, 4 });
		int output6 = oddValent.isOddValent(new int[] {});

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
