package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.TwinArray;

class TwinArrayTest {

	@Test
	void test() {
		TwinArray twin = new TwinArray();
		int output1 = twin.isTwin(new int[] {3, 5, 8, 10, 27});
		int output2 = twin.isTwin(new int[] {11, 9, 12, 13, 23});
		int output3 = twin.isTwin(new int[] {5, 3, 14, 7, 18, 67});
		int output4 = twin.isTwin(new int[] {13, 14, 15, 3, 5});
		int output5 = twin.isTwin(new int[] {1, 17, 8, 25, 67});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
	}

}
