package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.HasNValues;

class HasNValuesTest {

	@Test
	void test() {
		HasNValues values = new HasNValues();
		int output1 = values.hasNValues(new int[] { 1, 2, 2, 1 }, 2);
		int output2 = values.hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 3);
		int output3 = values.hasNValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 10);
		int output4 = values.hasNValues(new int[] { 1, 2, 2, 1 }, 3);
		int output5 = values.hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 2);
		int output6 = values.hasNValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 20);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
