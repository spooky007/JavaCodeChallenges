package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maharishi.Inertial;

class InertialTest {

	@Test
	void test() {
		Inertial inertialArray = new Inertial();
		int output1 = inertialArray.isInertial(new int[] { 1 });
		int output2 = inertialArray.isInertial(new int[] { 2 });
		int output3 = inertialArray.isInertial(new int[] { 1, 2, 3, 4 });
		int output4 = inertialArray.isInertial(new int[] { 1, 1, 1, 1, 1, 1, 2 });
		int output5 = inertialArray.isInertial(new int[] { 2, 12, 4, 6, 8, 11 });
		int output6 = inertialArray.isInertial(new int[] { 2, 12, 12, 4, 6, 8, 11 });
		int output7 = inertialArray.isInertial(new int[] { -2, -4, -6, -8, -11 });
		int output8 = inertialArray.isInertial(new int[] { 2, 3, 5, 7 });
		int output9 = inertialArray.isInertial(new int[] { 2, 4, 6, 8, 10 });
		
		assertEquals(0, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(1, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
		assertEquals(0, output7);
		assertEquals(0, output8);
		assertEquals(0, output9);
	}

}
