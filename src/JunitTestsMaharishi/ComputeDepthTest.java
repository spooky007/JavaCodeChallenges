package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ComputeDepth;

class ComputeDepthTest {

	@Test
	void test() {
		ComputeDepth depth = new ComputeDepth();
		int output1 = depth.computeDepth(42);
		int output2 = depth.computeDepth(7);
		int output3 = depth.computeDepth(13);
		int output4 = depth.computeDepth(25);
		
		assertEquals(9, output1);
		assertEquals(10, output2);
		assertEquals(8, output3);
		assertEquals(36, output4);
	}

}
