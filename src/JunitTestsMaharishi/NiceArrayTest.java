package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.NiceArray;

class NiceArrayTest {

	@Test
	void test() {
		NiceArray nice = new NiceArray();
		int output1 = nice.isNice(new int[] { 2, 10, 9, 3 });
		int output2 = nice.isNice(new int[] { 2, 2, 3, 3, 3 });
		int output3 = nice.isNice(new int[] { 1, 1, 1, 2, 1, 1 });
		int output4 = nice.isNice(new int[] { 0, -1, 1 });
		int output5 = nice.isNice(new int[] { 3, 4, 5, 7 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}

}
