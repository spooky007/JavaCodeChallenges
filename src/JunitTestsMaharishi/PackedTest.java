package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Packed;

class PackedTest {

	@Test
	void test() {
		Packed packed = new Packed();
		int output1 = packed.isPacked(new int[] { 2, 2, 1 });
		int output2 = packed.isPacked(new int[] { 2, 2, 1, 1, 2, 2 });
		int output3 = packed.isPacked(new int[] { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 });
		int output4 = packed.isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7, 1 });
		int output5 = packed.isPacked(new int[] { 7, 7, 7, 7, 1, 7, 7, 7 });
		int output6 = packed.isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7 });
		int output7 = packed.isPacked(new int[] {});
		int output8 = packed.isPacked(new int[] { 1, 2, 1 });
		int output9 = packed.isPacked(new int[] { 2, 1, 1 });
		int output10 = packed.isPacked(new int[] { -3, -3, -3 });
		int output11 = packed.isPacked(new int[] { 0, 2, 2 });
		int output12 = packed.isPacked(new int[] { 2, 1, 2 });
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(1, output6);
		assertEquals(1, output7);
		assertEquals(0, output8);
		assertEquals(0, output9);
		assertEquals(0, output10);
		assertEquals(0, output11);
		assertEquals(0, output12);
				
	}

}
