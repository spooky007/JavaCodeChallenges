package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ConsecutiveFactored;

class ConsecutiveFactoredTest {

	@Test
	void test() {
		ConsecutiveFactored factor = new ConsecutiveFactored();
		int output1 = factor.isConsecutiveFactored(24);
		int output2 = factor.isConsecutiveFactored(105);
		int output3 = factor.isConsecutiveFactored(90);
		int output4 = factor.isConsecutiveFactored(23);
		int output5 = factor.isConsecutiveFactored(15);
		int output6 = factor.isConsecutiveFactored(2);
		int output7 = factor.isConsecutiveFactored(0);
		int output8 = factor.isConsecutiveFactored(-12);
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
		assertEquals(0, output8);
	}

}
