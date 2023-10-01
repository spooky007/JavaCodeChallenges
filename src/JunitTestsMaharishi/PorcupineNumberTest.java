package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.PorcupineNumber;

class PorcupineNumberTest {

	@Test
	void test() {
		PorcupineNumber porcupineNumber = new PorcupineNumber();
		int output1 = porcupineNumber.findPorcupineNumber(0);
		int output2 = porcupineNumber.findPorcupineNumber(139);
		
		assertEquals(139, output1);
		assertEquals(409, output2);
	}

}
