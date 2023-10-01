package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CompleteArray;

class CompleteArrayTest {

	@Test
	void test() {
		CompleteArray completeArray = new CompleteArray();
		int output1 = completeArray.isComplete(new int[] { 36, -28 });
		int output2 = completeArray.isComplete(new int[] { 36, 28 });
		int output3 = completeArray.isComplete(new int[] { 4 });
		int output4 = completeArray.isComplete(new int[] { 3, 2, 1, 1, 5, 6 });
		int output5 = completeArray.isComplete(new int[] { 3, 7, 23, 13, 107, -99, 97, 81 });

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
	}

}
