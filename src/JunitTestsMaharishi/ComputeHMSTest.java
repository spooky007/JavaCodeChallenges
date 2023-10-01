package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import maharishi.ComputeHMS;

class ComputeHMSTest {

	@Test
	void test() {
		ComputeHMS hms = new ComputeHMS();
		int[] output1 = hms.computeHMS(3735);
		int[] output2 = hms.computeHMS(380);
		int[] output3 = hms.computeHMS(3650);
		int[] output4 = hms.computeHMS(55);
		int[] output5 = hms.computeHMS(0);
		
		assertArrayEquals(new int[] {1, 2, 15}, output1);
		assertArrayEquals(new int[] {0, 6, 20}, output2);
		assertArrayEquals(new int[] {1, 0, 50}, output3);
		assertArrayEquals(new int[] {0, 0, 55}, output4);
		assertArrayEquals(new int[] {0, 0, 0}, output5);
	}
}
