package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.IsSequencedArray;

class IsSequencedArrayTest {

	@Test
	void test() {
		IsSequencedArray seqArray = new IsSequencedArray();
		int output1 = seqArray.isSequencedArray(new int[] { 1, 2, 3, 4, 5 }, 1, 5);
		int output2 = seqArray.isSequencedArray(new int[] { 1, 3, 4, 2, 5 }, 1, 5);
		int output3 = seqArray.isSequencedArray(new int[] { -5, -5, -4, -4, -4, -3, -3, -2, -2, -2 }, -5, -2);
		int output4 = seqArray.isSequencedArray(new int[] { 0, 1, 2, 3, 4, 5 }, 1, 5);
		int output5 = seqArray.isSequencedArray(new int[] { 1, 2, 3, 4 }, 1, 5);
		int output6 = seqArray.isSequencedArray(new int[] { 1, 2, 5 }, 1, 5);
		int output7 = seqArray.isSequencedArray(new int[] { 5, 4, 3, 2, 1 }, 1, 5);
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
