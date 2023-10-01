package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Hodder;

class HodderTest {

	@Test
	void test() {
		Hodder hodder = new Hodder();
		int output1 = hodder.isHodder(3);
		int output2 = hodder.isHodder(7);
		int output3 = hodder.isHodder(31);
		int output4 = hodder.isHodder(127);
		int output5 = hodder.isHodder(19);
		int output6 = hodder.isHodder(23);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
