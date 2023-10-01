package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.AllValuesTheSame;

class AllValuesTheSameTest {

	@Test
	void test() {
		AllValuesTheSame values = new AllValuesTheSame();
		int output1 = values.AllValuesTheSame(new int[] { 1, 1, 1, 1 });
		int output2 = values.AllValuesTheSame(new int[] { 83, 83, 83 });
		int output3 = values.AllValuesTheSame(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
		int output4 = values.AllValuesTheSame(new int[] { 1, -2343456, 1, -2343456 });
		int output5 = values.AllValuesTheSame(new int[] { 0, 0, 0, 0, -1 });
		int output6 = values.AllValuesTheSame(new int[] { 432123456 });
		int output7 = values.AllValuesTheSame(new int[] { -432123456 });
		int output8 = values.AllValuesTheSame(new int[] {});

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(1, output6);
		assertEquals(1, output7);
		assertEquals(0, output8);
	}

}
