package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MatchPattern;

class MatchPatternTest {

	@Test
	void test() {
		MatchPattern matchPattern = new MatchPattern();
		int output1 = matchPattern.matchPattern(new int[] { 1, 1, 1, 2, 2, 1, 1, 3 }, 8, new int[] { 1, 2, 1, 3 }, 4);
		
		assertEquals(1, output1);
	}

}
