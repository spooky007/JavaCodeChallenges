package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CountOnes;

class CountOnesTest {

	@Test
	void test() {
		CountOnes countOnes = new CountOnes();
		int output1 = countOnes.countOnes(9);
		int output2 = countOnes.countOnes(5);
		int output3 = countOnes.countOnes(15);
		
		assertEquals(2, output1);
		assertEquals(2, output2);
		assertEquals(4, output3);
	}
}
