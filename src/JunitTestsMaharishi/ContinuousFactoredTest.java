package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.ContinuousFactored;

class ContinuousFactoredTest {

	@Test
	void test() {
		ContinuousFactored continuous = new ContinuousFactored();
		int output1 = continuous.isContinuousFactored(6);
		int output2 = continuous.isContinuousFactored(60);
		int output3 = continuous.isContinuousFactored(120);
		int output4 = continuous.isContinuousFactored(90);
		int output5 = continuous.isContinuousFactored(21);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(0, output5);
	}

}
