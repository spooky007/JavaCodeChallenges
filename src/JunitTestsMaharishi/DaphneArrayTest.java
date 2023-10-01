package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.DaphneArray;

class DaphneArrayTest {

	@Test
	void test() {
		DaphneArray daphne = new DaphneArray();
		int output1 = daphne.isDaphne(new int[] {2, 4, 2});
		int output2 = daphne.isDaphne(new int[] {1, 3, 17, -5});
		int output3 = daphne.isDaphne(new int[] {3, 2, 5});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
	}

}
