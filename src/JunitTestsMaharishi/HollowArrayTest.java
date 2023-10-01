package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.HollowArray;

class HollowArrayTest {

	@Test
	void test() {
		HollowArray hollow = new HollowArray();
		int output1 = hollow.isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4 });
		int output2 = hollow.isHollow(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 });
		int output3 = hollow.isHollow(new int[] { 1, 2, 0, 0, 3, 4 });
		int output4 = hollow.isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 });
		int output5 = hollow.isHollow(new int[] { 3, 8, 3, 0, 0, 0, 3, 3 });
		int output6 = hollow.isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 });
		int output7 = hollow.isHollow(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 });
		int output8 = hollow.isHollow(new int[] { 0, 0, 0 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
		assertEquals(1, output8);
	}

}
