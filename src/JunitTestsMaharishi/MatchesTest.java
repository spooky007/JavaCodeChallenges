package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maharishi.Matches;

class MatchesTest {

	@Test
	void test() {
		Matches matches = new Matches();
		int output1 = matches.matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[]  {3, -2, 3});
		int output2 = matches.matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[]  {2, 1, -1, -1, 2, 1});
		int output3 = matches.matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[]  {1, 2, -1, -1, 1, 2});
		int output4 = matches.matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[]   {2, 1, -2, 3});
		int output5 = matches.matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[]  {1, 1, 1, -1, -1, 1, 1, 1});
		int output6 = matches.matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[]  {4, -1, 3});
		int output7 = matches.matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[]  {2, -3, 3});
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
	}

}
