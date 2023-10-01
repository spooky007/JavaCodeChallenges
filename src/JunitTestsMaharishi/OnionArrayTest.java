package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.OnionArray;

class OnionArrayTest {

	@Test
	void test() {
		OnionArray onionArray = new OnionArray();
		int output1 = onionArray.isOnionArray(new int[] { 1, 2, 19, 4, 5 });
		int output2 = onionArray.isOnionArray(new int[] { 1, 2, 3, 4, 15 });
		int output3 = onionArray.isOnionArray(new int[] { 1, 3, 9, 8 });
		int output4 = onionArray.isOnionArray(new int[] { 2 });
		int output5 = onionArray.isOnionArray(new int[] {});
		int output6 = onionArray.isOnionArray(new int[] {-2, 5, 0, 5, 12} );
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
	}

}
