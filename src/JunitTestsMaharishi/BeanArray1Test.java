package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.BeanArray1;

class BeanArray1Test {

	@Test
	void test() {
		BeanArray1 bean = new BeanArray1();
		int output1 = bean.isBean(new int[] { 4, 9, 8 });
		int output2 = bean.isBean(new int[] { 2, 2, 5, 11, 23 });
		int output3 = bean.isBean(new int[] { 7, 7, 3, 6 });
		int output4 = bean.isBean(new int[] { 0 });
		int output5 = bean.isBean(new int[] { 3, 8, 4 });
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}
}
