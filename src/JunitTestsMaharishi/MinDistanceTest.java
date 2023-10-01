package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.MinDistance;

class MinDistanceTest {

	@Test
	void test() {
		MinDistance minDistance = new MinDistance();
		int output1 = minDistance.minDistance(13013);
		int output2 = minDistance.minDistance(8);
		
		assertEquals(2, output1);
		assertEquals(1, output2);
	}

}
