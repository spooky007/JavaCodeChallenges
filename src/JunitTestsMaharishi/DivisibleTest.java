package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Divisible;

class DivisibleTest {

	@Test
	void test() {
		Divisible divisible = new Divisible();
		int output1 = divisible.isDivisible(new int[] { 3, 3, 6, 36 }, 3);
		int output2 = divisible.isDivisible(new int[] { 4 }, 2);
		int output3 = divisible.isDivisible(new int[] { 3, 4, 3, 6, 36 }, 3);
		int output4 = divisible.isDivisible(new int[] { 6, 12, 24, 36 }, 12);
		int output5 = divisible.isDivisible(new int[] {}, 4);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
	}

}
