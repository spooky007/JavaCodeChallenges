package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.RailRoadTie;

class RailRoadTieTest {

	@Test
	void test() {
		RailRoadTie railRoadTie = new RailRoadTie();
		int output1 = railRoadTie.isRailRoadTie(new int[] {1, 2});
		int output2 = railRoadTie.isRailRoadTie(new int[] {1, 2, 0, 1, 2, 0, 1, 2});
		int output3 = railRoadTie.isRailRoadTie(new int[] {3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3});
		int output4 = railRoadTie.isRailRoadTie(new int[] {0, 0, 0, 0} );
		int output5 = railRoadTie.isRailRoadTie(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} );
		int output6 = railRoadTie.isRailRoadTie(new int[] {1, 3, 0, 3, 5, 0} );
		
		assertEquals(1, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(0, output5);
		assertEquals(0, output6);
	}

}
