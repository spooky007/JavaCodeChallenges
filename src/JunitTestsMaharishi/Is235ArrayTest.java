package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Is235Array;

class Is235ArrayTest {

	@Test
	void test() {
		Is235Array is235Array = new Is235Array();
		int output1 = is235Array.is235Array(new int[] { 2, 3, 5, 7, 11 });
		int output2 = is235Array.is235Array(new int[] { 2, 3, 6, 7, 11 });
		int output3 = is235Array.is235Array(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		int output4 = is235Array.is235Array(new int[] {2, 4, 8, 16, 32});
		int output5 = is235Array.is235Array(new int[] {3, 9, 27, 7, 1, 1, 1, 1, 1});
		int output6 = is235Array.is235Array(new int[] { 7, 11, 77, 49 });
		int output7 = is235Array.is235Array(new int[] { 2 });
		int output8 = is235Array.is235Array(new int[] {});
		int output9 = is235Array.is235Array(new int[] { 7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7 });

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
		assertEquals(1, output7);
		assertEquals(1, output8);
		assertEquals(1, output9);
	}

}
