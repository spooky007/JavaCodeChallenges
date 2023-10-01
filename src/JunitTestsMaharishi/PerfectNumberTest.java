package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.PerfectNumber;

class PerfectNumberTest {

	@Test
	void test() {
		PerfectNumber perfectNumber = new PerfectNumber();
		int output1 = perfectNumber.henry(1, 3);
		
		assertEquals(502, output1);
	}

}
