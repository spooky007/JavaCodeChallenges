package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.TripleArray;

class TripleArrayTest {

	@Test
	void test() {
		TripleArray triple = new TripleArray();
		int output1 = triple.isTriple(new int[] { 3, 1, 2, 1, 3, 1, 3, 2, 2 });
		int output2 = triple.isTriple(new int[] { 2, 5, 2, 5, 5, 2, 5 });
		int output3 = triple.isTriple(new int[] { 3, 1, 1, 1 });

		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
	}

}
