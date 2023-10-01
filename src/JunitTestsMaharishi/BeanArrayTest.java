package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.BeanArray;

class BeanArrayTest {

	@Test
	void test() {
		BeanArray bean = new BeanArray();
		int output1 = bean.isBean(new int[] { 1, 2, 3, 9, 6, 13 });
		int output2 = bean.isBean(new int[] { 3, 4, 6, 7, 13, 15 });
		int output3 = bean.isBean(new int[] { 1, 2, 3, 4, 10, 11, 12 });
		int output4 = bean.isBean(new int[] { 3, 6, 9, 5, 7, 13, 6, 17 });
		int output5 = bean.isBean(new int[] { 9, 6, 8 });
		int output6 = bean.isBean(new int[] { 4, 7, 16 });

		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
