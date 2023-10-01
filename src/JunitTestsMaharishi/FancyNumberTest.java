package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FancyNumber;

class FancyNumberTest {

	@Test
	void test() {
		FancyNumber fancy = new FancyNumber();
		int output1 = fancy.isFancyNumber(5);
		int output2 = fancy.isFancyNumber(17);
		int output3 = fancy.isFancyNumber(61);
		int output4 = fancy.isFancyNumber(60);
		int output5 = fancy.isFancyNumber(36);

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
	}
}
