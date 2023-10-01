package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MeeraArray;

class MeeraArrayTest {

	@Test
	void test() {
		MeeraArray meera = new MeeraArray();
		int output1 = meera.isMeera(new int[] { 3, 5, -2 });
		int output2 = meera.isMeera(new int[] { 8, 3, 4 });
		
		assertEquals(1, output1);
		assertEquals(0, output2);
	}

}
