package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SetEqual;

class SetEqualTest {

	@Test
	void test() {
		SetEqual setEqual = new SetEqual();
		int output1 = setEqual.isSetEqual(new int[] { 1, 9, 12 }, new int[] { 12, 1, 9 });
		int output2 = setEqual.isSetEqual(new int[] { 9, 1, 12, 1 }, new int[] { 1, 9, 12, 9, 12, 1, 9 });
		int output3 = setEqual.isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 1 });
		int output4 = setEqual.isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 6 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
	}

}
