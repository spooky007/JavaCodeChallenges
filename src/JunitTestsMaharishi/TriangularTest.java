package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Triangular;

class TriangularTest {

	@Test
	void test() {
		Triangular triangular = new Triangular();
		int output1 = triangular.isTriangular(1);
		int output2 = triangular.isTriangular(3);
		int output3 = triangular.isTriangular(5);
		int output4 = triangular.isTriangular(6);
		int output5 = triangular.isTriangular(10);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
	}

}
