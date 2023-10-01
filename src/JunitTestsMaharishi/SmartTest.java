package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.SmartNumber;

class SmartTest {

	@Test
	void test() {
		SmartNumber smart = new SmartNumber();
		int output1 = smart.isSmart(8);
		int output2 = smart.isSmart(4);
		int output3 = smart.isSmart(7);
		int output4 = smart.isSmart(11);
		int output5 = smart.isSmart(16);
		int output6 = smart.isSmart(20);
		
		assertEquals(0, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(0, output6);
	}

}
