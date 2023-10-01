package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FineArray;

class FineArrayTest {

	@Test
	void test() {
		FineArray fineArray = new FineArray();
		int output1 = fineArray.isFineArray(new int[] {4, 7, 9, 6, 5});
		int output2 = fineArray.isFineArray(new int[] {4, 9, 6, 33});
		int output3 = fineArray.isFineArray(new int[] {3, 8, 15});
		int output4 = fineArray.isFineArray(new int[] {4, 11, 15});
		
		int output5 = fineArray.isFineArray(new int[] {3, 5, 8, 15});
		int output6 = fineArray.isFineArray(new int[] {5, 7, 8, 15});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
	}

}
