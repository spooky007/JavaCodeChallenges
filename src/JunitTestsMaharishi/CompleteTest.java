package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Complete;

class CompleteTest {

	@Test
	void test() {
		Complete complete = new Complete();
		int output1 = complete.isComplete(new int[] { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7 });
		int output2 = complete.isComplete(new int[] { 5, 7, 9, 13 });
		int output3 = complete.isComplete(new int[] { 2, 2 });
		int output4 = complete.isComplete(new int[] { 2, 6, 3, 4 });

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
	}

}
