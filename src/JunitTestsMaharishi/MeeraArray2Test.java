package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MeeraArray2;

class MeeraArray2Test {

	@Test
	void test() {
		MeeraArray2 meera = new MeeraArray2();
		int output1 = meera.isMeera(new int[] { 7, 9, 0, 10, 1 });
		int output2 = meera.isMeera(new int[] { 6, 10, 8 });
		int output3 = meera.isMeera(new int[] { 7, 6, 1 });
		int output4 = meera.isMeera(new int[] { 9, 10, 0 });
		int output5 = meera.isMeera(new int[] { 1, 1, 0, 8, 0, 9, 9, 1 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
	}

}
