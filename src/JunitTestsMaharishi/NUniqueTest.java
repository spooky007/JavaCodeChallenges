package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.NUnique;

class NUniqueTest {

	@Test
	void test() {
		NUnique nUnique = new NUnique();
		int output1 = nUnique.isNUnique(new int[] {7, 3, 3, 2, 4}, 6);
		int output2 = nUnique.isNUnique(new int[] {7, 3, 3, 2, 4}, 10);
		int output3 = nUnique.isNUnique(new int[] {7, 3, 3, 2, 4}, 11);
		int output4 = nUnique.isNUnique(new int[] {7, 3, 3, 2, 4}, 8);
		int output5 = nUnique.isNUnique(new int[] {7, 3, 3, 2, 4}, 4);
		int output6 = nUnique.isNUnique(new int[] {}, 6);
		
		assertEquals(0, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
