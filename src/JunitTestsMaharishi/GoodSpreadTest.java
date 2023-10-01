package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.GoodSpread;

class GoodSpreadTest {

	@Test
	void test() {
		GoodSpread spread = new GoodSpread();
		int output1 = spread.isGoodSpread(new int[] { 2, 1, 2, 5, 2, 1, 5, 9 });
		int output2 = spread.isGoodSpread(new int[] {3, 1, 3 ,1, 3, 5, 5, 3});
		
		assertEquals(1, output1);
		assertEquals(0, output2);
	}
}
