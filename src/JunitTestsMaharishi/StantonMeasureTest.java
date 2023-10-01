package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.StantonMeasure;

class StantonMeasureTest {

	@Test
	void test() {
		StantonMeasure stanton = new StantonMeasure();
		int output1 = stanton.isStantonMeasure(new int[] {1});
		int output2 = stanton.isStantonMeasure(new int[] {0});
		int output3 = stanton.isStantonMeasure(new int[] {3, 1, 1, 4});
		int output4 = stanton.isStantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
		int output5 = stanton.isStantonMeasure(new int[] {});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(6, output4);
		assertEquals(0, output5);
	}

}
