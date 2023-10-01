package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CubePerfect;

class CubePerfectTest {

	@Test
	void test() {
		CubePerfect cubePerfect = new CubePerfect();
		int output1 = cubePerfect.isCubePerfect(new int[] { 1, 1, 1, 1 });
		int output2 = cubePerfect.isCubePerfect(new int[] { 64 });
		int output3 = cubePerfect.isCubePerfect(new int[] { 63 });
		int output4 = cubePerfect.isCubePerfect(new int[] { -1, 0, 1 });
		int output5 = cubePerfect.isCubePerfect(new int[] { });
		int output6 = cubePerfect.isCubePerfect(new int[] { 3, 7, 21, 36 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(0, output6);
	}

}
