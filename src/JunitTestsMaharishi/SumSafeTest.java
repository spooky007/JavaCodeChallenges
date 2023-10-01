package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SumSafe;

class SumSafeTest {

	@Test
	void test() {
		SumSafe sumSafe = new SumSafe();
		int output1 = sumSafe.isSumSafe(new int[] {5, -5, 0});
		int output2 = sumSafe.isSumSafe(new int[] {5, -2, 1});
		int output3 = sumSafe.isSumSafe(new int[] {});
		
		assertEquals(0, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
	}

}
