package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ConvertToBase10;

class ConvertToBase10Test {

	@Test
	void test() {
		ConvertToBase10 convertTo10 = new ConvertToBase10();
		int output1 = convertTo10.convertToBase10(new int[] { 1, 0, 1, 1 }, 2);
		int output2 = convertTo10.convertToBase10(new int[] { 1, 1, 2 }, 3);
		int output3 = convertTo10.convertToBase10(new int[] { 3, 2, 5 }, 8);
		int output4 = convertTo10.convertToBase10(new int[] { 3, 7, 1 }, 6);
		
		assertEquals(11, output1);
		assertEquals(14, output2);
		assertEquals(213, output3);
		assertEquals(-1, output4);
	}

}
