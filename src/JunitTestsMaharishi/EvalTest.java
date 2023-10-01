package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Eval;

class EvalTest {

	@Test
	void test() {
		Eval eval = new Eval();
		double output1 = eval.eval(1.0, new int[] { 0, 1, 2, 3, 4 });
		double output2 = eval.eval(3.0, new int[] { 3, 2, 1 });
		double output3 = eval.eval(2.0, new int[] { 3, -2, -1 });
		double output4 = eval.eval(-3.0, new int[] { 3, 2, 1 });
		double output5 = eval.eval(2.0, new int[] { 3, 2 });
		double output6 = eval.eval(2.0, new int[] { 4, 0, 9 });
		double output7 = eval.eval(2.0, new int[] { 10 });
		double output8 = eval.eval(10.0, new int[] { 0, 1 });
		
		assertEquals(10.0, output1);
		assertEquals(18.0, output2);
		assertEquals(-5.0, output3);
		assertEquals(6.0, output4);
		assertEquals(7.0, output5);
		assertEquals(40.0, output6);
		assertEquals(10.0, output7);
		assertEquals(10.0, output8);
	}

}
