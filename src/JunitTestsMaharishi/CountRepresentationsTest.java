package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.CountRepresentations;

class CountRepresentationsTest {

	@Test
	void test() {
		CountRepresentations representations = new CountRepresentations();
		int output1 = representations.countRepresentations(12);
		int output2 = representations.countRepresentations(20);
		
		assertEquals(15, output1);
		assertEquals(41, output2);
	}

}
