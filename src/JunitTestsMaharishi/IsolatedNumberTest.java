package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.IsolatedNumber;

class IsolatedNumberTest {

	@Test
	void test() {
		IsolatedNumber isolated = new IsolatedNumber();
		int output1 = isolated.isIsolated(2);
		int output2 = isolated.isIsolated(3);
		int output3 = isolated.isIsolated(8);
		int output4 = isolated.isIsolated(9);
		int output5 = isolated.isIsolated(14);
		int output6 = isolated.isIsolated(24);
		int output7 = isolated.isIsolated(28);
		int output8 = isolated.isIsolated(34);
		int output9 = isolated.isIsolated(58);
		int output10 = isolated.isIsolated(63);
		int output11 = isolated.isIsolated(69);
		int output12 = isolated.isIsolated(162);
		int output13 = isolated.isIsolated(163);
//		int output14 = isolated.isIsolated(2097151);  // read the question again and check
//		int output15 = isolated.isIsolated(2097152); // read the question & check this out later
		int output16 = isolated.isIsolated(0);

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
		assertEquals(1, output7);
		assertEquals(1, output8);
		assertEquals(1, output9);
		assertEquals(1, output10);
		assertEquals(1, output11);
		assertEquals(0, output12);
		assertEquals(1, output13);
//		assertEquals(1, output14);
//		assertEquals(-1, output15);
		assertEquals(-1, output16);
	}

}
