package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import maharishi.FilterArray;

class FilterArrayTest {

	@Test
	void test() {
		FilterArray filterArray = new FilterArray();
		int[] output1 = filterArray.filterArray(new int[] { 9, -9 }, 0);
		int[] output2 = filterArray.filterArray(new int[] { 9, -9 }, 1);
		int[] output3 = filterArray.filterArray(new int[] { 9, -9 }, 2);
		int[] output4 = filterArray.filterArray(new int[] { 9, -9 }, 3);
		int[] output5 = filterArray.filterArray(new int[] { 9, -9 }, 4);
		int[] output6 = filterArray.filterArray(new int[] { 9, -9 }, 3);
		int[] output7 = filterArray.filterArray(new int[] { 0, 9, 12, 18, -6 }, 11);

		assertArrayEquals(new int[] {}, output1);
		assertArrayEquals(new int[] { 9 }, output2);
		assertArrayEquals(new int[] { -9 }, output3);
		assertArrayEquals(new int[] { 9, -9 }, output4);
		assertArrayEquals(null, output5);
		assertArrayEquals(new int[] {9, -9}, output6);
		assertArrayEquals(new int[] {0, 9, 18}, output7);
	}

}
