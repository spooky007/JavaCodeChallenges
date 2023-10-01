package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.TrivalentArray;

class TrivalentArrayTest {

	@Test
	void test() {
		TrivalentArray trivalent = new TrivalentArray();
		int output1 = trivalent.isTrivalent(new int[] { -1, 0, 1, 0, 0, 0 });
		int output2 = trivalent.isTrivalent(new int[] {});
		int output3 = trivalent.isTrivalent(new int[] { 2147483647, -1, -1, -2147483648 });
		int output4 = trivalent.isTrivalent(new int[] { 22, 19, 10, 10, 19, 22, 22, 10 });
		int output5 = trivalent.isTrivalent(new int[] { 1, 2, 2, 2, 2, 2, 2 });
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}

}
