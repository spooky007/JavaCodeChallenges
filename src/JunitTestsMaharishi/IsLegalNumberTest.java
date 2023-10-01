package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.IsLegalNumber;

class IsLegalNumberTest {

	@Test
	void test() {
		IsLegalNumber legal = new IsLegalNumber();
		int output1 = legal.isLegalNumber(new int[]  {3, 2, 1}, 4);
		int output2 = legal.isLegalNumber(new int[]  {3, 7, 1}, 6);
		
		assertEquals(1, output1);
		assertEquals(0, output2);
	}

}
