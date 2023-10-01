package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.NPrimeable;

class NPrimeableTest {

	@Test
	void test() {
		NPrimeable primeable = new NPrimeable();
		int output1 = primeable.isNPrimeable(new int[] {5, 15, 27}, 2);
		int output2 = primeable.isNPrimeable(new int[] {5, 15, 27}, 3);
		int output3 = primeable.isNPrimeable(new int[] {5, 15, 26}, 2);
		int output4 = primeable.isNPrimeable(new int[] {1, 1, 1, 1, 1, 1, 1}, 4);
		int output5 = primeable.isNPrimeable(new int[] {}, 2);
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
	}

}
