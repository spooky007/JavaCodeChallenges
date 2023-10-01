package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Evens;

class EvensTest {

	@Test
	void test() {
		Evens evens = new Evens();
		int output1 = evens.isEvens(2426);
		int output2 = evens.isEvens(8642);
		int output3 = evens.isEvens(3224);
		int output4 = evens.isEvens(468438);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
	}

}
