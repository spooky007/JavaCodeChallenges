package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.IsStacked;

class IsStackedTest {

	@Test
	void test() {
		IsStacked stack = new IsStacked();
		int output1 = stack.isStacked(1);
		int output2 = stack.isStacked(3);
		int output3 = stack.isStacked(6);
		int output4 = stack.isStacked(10);
		int output5 = stack.isStacked(15);
		int output6 = stack.isStacked(7);
		int output7 = stack.isStacked(8);
		int output8 = stack.isStacked(9);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
		assertEquals(0, output8);
	}

}
