package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maharishi.ClosestFibonacci;

class ClosestFibonacciTest {

	@Test
	void test() {
		ClosestFibonacci fibonacci = new ClosestFibonacci();
		int output1 = fibonacci.closestFibonacciSequence(13);
		int output2 = fibonacci.closestFibonacciSequence(33);
		int output3 = fibonacci.closestFibonacciSequence(34);
		int output4 = fibonacci.closestFibonacciSequence(9);
		
		assertEquals(13, output1);
		assertEquals(21, output2);
		assertEquals(34, output3);
		assertEquals(8, output4);
	}

}
