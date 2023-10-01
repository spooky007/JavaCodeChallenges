package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.IsSquare;

class isSquareTest {

	@Test
	void test() {
		IsSquare square = new IsSquare();
		int output1 = square.isSquare(4);
		int output2 = square.isSquare(25);
		int output3 = square.isSquare(-4);
		int output4 = square.isSquare(8);
		int output5 = square.isSquare(0);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
	}

}
