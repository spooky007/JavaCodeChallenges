package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CubePowerful;

class CubePowerfulTest {

	@Test
	void test() {
		CubePowerful cubePowerful = new CubePowerful();
		int output1 = cubePowerful.isCubePowerful(153);
		int output2 = cubePowerful.isCubePowerful(370);
		int output3 = cubePowerful.isCubePowerful(371);
		int output4 = cubePowerful.isCubePowerful(407);
		int output5 = cubePowerful.isCubePowerful(87);
		int output6 = cubePowerful.isCubePowerful(0);
		int output7 = cubePowerful.isCubePowerful(-81);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
	}

}
