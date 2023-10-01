package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MeeraNumber;

class MeeraNumberTest {

	@Test
	void test() {
		MeeraNumber meera = new MeeraNumber();
		int output1 = meera.isMeera(6);
		int output2 = meera.isMeera(30);
		int output3 = meera.isMeera(21);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
	}

}
