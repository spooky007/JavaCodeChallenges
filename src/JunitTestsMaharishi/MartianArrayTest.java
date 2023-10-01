package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MartianArray;

class MartianArrayTest {

	@Test
	void test() {
		MartianArray martianArray = new MartianArray();
		int output1 = martianArray.isMartian(new int[] { 1, 3 });
		int output2 = martianArray.isMartian(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 });
		int output3 = martianArray.isMartian(new int[] { 1, 3, 2 });
		int output4 = martianArray.isMartian(new int[] { 1, 3, 2, 2, 1, 5, 1, 5 });
		int output5 = martianArray.isMartian(new int[] { 1, 2, -18, -18, 1, 2 });
		int output6 = martianArray.isMartian(new int[] {});
		int output7 = martianArray.isMartian(new int[] { 1 });
		int output8 = martianArray.isMartian(new int[] { 2 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(1, output7);
		assertEquals(0, output8);
	}

}
