package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maharishi.Power;

class PowerTest {

	@Test
	void test() {
		Power power = new Power();
		int output1 = power.power(5, 3);
		int output2 = power.power(10, 2);
		int output3 = power.power(5, 0);
		int output4 = power.power(5, 1);
		int output5 = power.power(2, 4);
		
		assertEquals(125, output1);
		assertEquals(100, output2);
		assertEquals(1, output3);
		assertEquals(5, output4);
		assertEquals(16, output5);
	}

}
