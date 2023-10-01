package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Fibonacci;

class FibonacciTest {

	@Test
	void test() {
		Fibonacci fibo = new Fibonacci();
		int output1 = fibo.isFibonacci(13);
		int output2 = fibo.isFibonacci(5);
		int output3 = fibo.isFibonacci(8);
		int output4 = fibo.isFibonacci(27);
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
	}

}
