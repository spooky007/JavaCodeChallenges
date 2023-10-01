package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MeeraArray1;

class MeeraArray1Test {

	@Test
	void test() {
		MeeraArray1 meera = new MeeraArray1();
		int output1 = meera.isMeera(new int[] { -4, 0, 1, 0, 2, 1 });
		int output2 = meera.isMeera(new int[] { -8, 0, 0, 8, 0 });
		int output3 = meera.isMeera(new int[] { -8, 0, 0, 2, 0 });

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
	}

}
