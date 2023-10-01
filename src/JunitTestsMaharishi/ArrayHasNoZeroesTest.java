package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ArrayHasNoZeroes;

class ArrayHasNoZeroesTest {

	@Test
	void test() {
		ArrayHasNoZeroes arr = new ArrayHasNoZeroes();
		int output1 = arr.arrayHasNoZeroes(new int[] { 1, 2, 3 });
		int output2 = arr.arrayHasNoZeroes(new int[] { 1, 0, 4, 0 });
		int output3 = arr.arrayHasNoZeroes(new int[] { 1, 2, 3, 0 });
		int output4 = arr.arrayHasNoZeroes(new int[] { 0, 0, 0, 0 });
		int output5 = arr.arrayHasNoZeroes(new int[] {});

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
	}

}
