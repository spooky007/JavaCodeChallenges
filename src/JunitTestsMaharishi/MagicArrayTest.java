package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MagicArray;

class MagicArrayTest {

	@Test
	void test() {
		MagicArray magic = new MagicArray();
		int output1 = magic.isMagicArray(new int[] { 21, 3, 7, 9, 11, 4, 6 });
		int output2 = magic.isMagicArray(new int[] { 13, 4, 4, 4, 4 });
		int output3 = magic.isMagicArray(new int[] { 10, 5, 5 });
		int output4 = magic.isMagicArray(new int[] { 0, 6, 8, 20 });
		int output5 = magic.isMagicArray(new int[] { 3 });

		int output6 = magic.isMagicArray(new int[] { 8, 5, -5, 5, 3 });

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(0, output6);
	}

}
