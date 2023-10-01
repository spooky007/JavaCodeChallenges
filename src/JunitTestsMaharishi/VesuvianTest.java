package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Vesuvian;

class VesuvianTest {

	@Test
	void test() {
		Vesuvian vesuvian = new Vesuvian();
		int output1 = vesuvian.isVesuvian(50);
		int output2 = vesuvian.isVesuvian(65);
		int output3 = vesuvian.isVesuvian(85);
		int output4 = vesuvian.isVesuvian(25);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
	}

}
