package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Layered;

class LayeredTest {

	@Test
	void test() {
		Layered layered = new Layered();
		int output1 = layered.isLayered(new int[] { 1, 1, 2, 2, 2, 3, 3 });
		int output2 = layered.isLayered(new int[] { 3, 3, 3, 3, 3, 3, 3 });
		int output3 = layered.isLayered(new int[] { 1, 2, 2, 2, 3, 3 });
		int output4 = layered.isLayered(new int[] { 2, 2, 2, 3, 3, 1, 1 });
		int output5 = layered.isLayered(new int[] { 2 });
		int output6 = layered.isLayered(new int[] {});

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
