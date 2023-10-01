package JunitTestsMaharishi;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import maharishi.DoIntegerBasedRounding;

class DoIntegerBasedRoundingTest {

	private DoIntegerBasedRounding rounding = new DoIntegerBasedRounding();
	int[] arr1;
	@Before
	void init() {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] arr3 = {1, 2, 3, 4, 5};
		int[] arr4 = {-1, -2, -3, -4, -5};
		int[] arr5 = {-18, 1, 2, 3, 4, 5};
		int[] arr6 = {1, 2, 3, 4, 5};
		int[] arr7 = {1, 2, 3, 4, 5};
	}
	
	@Test
	public void testIntegerBasedRounding() {
//		assertArrayEquals(new int[] {2, 2, 4, 4, 6}, rounding.doIntegerBasedRounding(arr1, 2));
	}

}
