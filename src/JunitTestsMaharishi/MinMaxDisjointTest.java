package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MinMaxDisjoint;

class MinMaxDisjointTest {

	@Test
	void test() {
		MinMaxDisjoint disjoint = new MinMaxDisjoint();
		int output1 = disjoint.isMinMaxDisjoint(new int[] {18, -1, 3, 4, 0} );
		int output2 = disjoint.isMinMaxDisjoint(new int[]{9, 0, 5, 9});
		int output3 = disjoint.isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9});
		int output4 = disjoint.isMinMaxDisjoint(new int[]{7, 7, 7, 7} );
		int output5 = disjoint.isMinMaxDisjoint(new int[] {});
		int output6 = disjoint.isMinMaxDisjoint(new int[]{1, 2} );
		int output7 = disjoint.isMinMaxDisjoint(new int[] {1});
		int output8 = disjoint.isMinMaxDisjoint(new int[] {5, 4, 1, 3, 2});
		
		assertEquals(0, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
		assertEquals(0, output7);
		assertEquals(1, output8);
	}

}
