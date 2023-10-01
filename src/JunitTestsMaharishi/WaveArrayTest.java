package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.WaveArray;

class WaveArrayTest {

	@Test
	void test() {
		WaveArray wave = new WaveArray();
		int output1 = wave.isWave(new int[] { 7, 2, 9, 10, 5 });
		int output2 = wave.isWave(new int[] { 4, 11, 12, 1, 6 });
		int output3 = wave.isWave(new int[] { 1, 0, 5 });
		int output4 = wave.isWave(new int[] { 2 });
		int output5 = wave.isWave(new int[] { 2, 6, 3, 4 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}

}
