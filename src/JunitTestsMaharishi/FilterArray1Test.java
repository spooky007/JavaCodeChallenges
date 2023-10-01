package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FilterArray1;

class FilterArray1Test {

	@Test
	void test() {
		FilterArray1 filterArray = new FilterArray1();
		int output1 = filterArray.isFilter(new int[] { 1, 2, 3, 9, 6, 11 });
		int output2 = filterArray.isFilter(new int[] { 3, 4, 6, 7, 14, 16 });
		int output3 = filterArray.isFilter(new int[] { 1, 2, 3, 4, 10, 11, 13 });
		int output4 = filterArray.isFilter(new int[] { 3, 6, 5, 5, 13, 6, 13 });
		int output5 = filterArray.isFilter(new int[] { 9, 6, 18 });
		int output6 = filterArray.isFilter(new int[] { 4, 7, 13 });

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
