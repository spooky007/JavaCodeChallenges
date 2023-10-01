package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Normal;

class NormalTest {

	@Test
	void test() {
		Normal normal = new Normal();
		int output1 = normal.isNormal(1);
		int output2 = normal.isNormal(2);
		int output3 = normal.isNormal(3);
		int output4 = normal.isNormal(4);
		int output5 = normal.isNormal(5);
		int output6 = normal.isNormal(7);
		int output7 = normal.isNormal(8);
		int output8 = normal.isNormal(6);
		int output9 = normal.isNormal(9);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
		assertEquals(1, output7);
		assertEquals(0, output8);
		assertEquals(0, output9);
	}

}
