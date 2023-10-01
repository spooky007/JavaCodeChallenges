package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Complete1;

class Complete1Test {

	@Test
	void test() {
		Complete1 complete = new Complete1();
		int output1 = complete.isComplete(new int[] { 2, 3, 2, 4, 11, 6, 10, 9, 8 });
		int output2 = complete.isComplete(new int[] { 2, 3, 3, 6 });
		int output3 = complete.isComplete(new int[] { 2, -3, 4, 3, 6 });
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
	}

}
