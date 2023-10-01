package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FilterArray2;

class FilterArray2Test {

	@Test
	void test() {
		FilterArray2 filter = new FilterArray2();
		int output1 = filter.isFilterArray(new int[] { 1, 2, 3, 9, 6, 11 });
		int output2 = filter.isFilterArray(new int[] { 3, 4, 6, 7, 14, 16 });
		int output3 = filter.isFilterArray(new int[] { 1, 2, 3, 4, 10, 11, 13 });
		int output4 = filter.isFilterArray(new int[] { 3, 6, 5, 5, 13, 6, 13 });

		int output5 = filter.isFilterArray(new int[] { 9, 6, 18 });
		int output6 = filter.isFilterArray(new int[] { 4, 7, 13 });

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);

	}

}
