package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.FindSmallestBEQ;

class FindSmallestBEQTest {

	@Test
	void test() {
		FindSmallestBEQ beq = new FindSmallestBEQ();
		int output1 = beq.findSmallestBEQ();
		
		assertEquals(716, output1);
	}

}
