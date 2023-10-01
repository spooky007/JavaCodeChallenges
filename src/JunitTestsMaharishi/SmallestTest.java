package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Smallest;

class SmallestTest {

	@Test
	void test() {
		Smallest smallest = new Smallest();
		int output1 = smallest.smallest(4);
		int output2 = smallest.smallest(5);
		int output3 = smallest.smallest(6);
		int output4 = smallest.smallest(7);
		
		assertEquals(624, output1);
		assertEquals(624, output2);
		assertEquals(642, output3);
		assertEquals(4062, output4);
	}

}
