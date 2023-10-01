package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SequentiallyBoundedArray;

class SequentiallyBoundedArrayTest {

	@Test
	void test() {
		SequentiallyBoundedArray seqBounded = new SequentiallyBoundedArray();
		int output1 = seqBounded.isSequentiallyBounded(new int[] { 0, 1 });
		int output2 = seqBounded.isSequentiallyBounded(new int[] { -1, 2 });
		int output3 = seqBounded.isSequentiallyBounded(new int[] {});
		int output4 = seqBounded.isSequentiallyBounded(new int[] { 5, 5, 5, 5 });
		int output5 = seqBounded.isSequentiallyBounded(new int[] { 5, 5, 5, 2, 5 });

		assertEquals(0, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}

}
