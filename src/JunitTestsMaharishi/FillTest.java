package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maharishi.Fill;

class FillTest {

	@Test
	void test() {
		Fill fill = new Fill();
		int[] output1 = fill.fill(new int[] { 1, 2, 3, 5, 9, 12, -2, -1 }, 3, 10);
		int[] output2 = fill.fill(new int[] { 4, 2, -3, 12 }, 1, 5);
		int[] output3 = fill.fill(new int[] { 2, 6, 9, 0, -3 }, 0, 4);

		assertArrayEquals(new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 }, output1);
		assertArrayEquals(new int[] { 4, 4, 4, 4, 4 }, output2);
		assertArrayEquals(null, output3);
	}

}
