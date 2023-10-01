package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.RepsEqual;

class RepsEqualTest {

	@Test
	void test() {
		RepsEqual repsEqual = new RepsEqual();
		int option1 = repsEqual.repsEqual(new int[] {3, 2, 0, 5, 3}, 32053);
		int option2 = repsEqual.repsEqual(new int[] {3, 2, 0, 5}, 32053);
		int option3 = repsEqual.repsEqual(new int[] {3, 2, 0, 5, 3, 4}, 32053);
		int option4 = repsEqual.repsEqual(new int[] {2, 3, 0, 5, 3}, 32053);
		int option5 = repsEqual.repsEqual(new int[] {9, 3, 1, 1, 2}, 32053);
		int option6 = repsEqual.repsEqual(new int[] {0, 3, 2, 0, 5, 3}, 32053);
		
		assertEquals(1, option1);
		assertEquals(0, option2);
		assertEquals(0, option3);
		assertEquals(0, option4);
		assertEquals(0, option5);
		assertEquals(1, option6);
	}

}
