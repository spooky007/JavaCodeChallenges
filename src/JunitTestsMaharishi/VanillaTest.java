package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Vanilla;

class VanillaTest {

	@Test
	void test() {
		Vanilla vanilla = new Vanilla();
		int output1 = vanilla.isVanilla(new int[] {1});
		int output2 = vanilla.isVanilla(new int[] {11, 22, 13, 34, 125});
		int output3 = vanilla.isVanilla(new int[] {9, 999, 99999, -9999} );
		int output4 = vanilla.isVanilla(new int[] {});
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
	}

}
