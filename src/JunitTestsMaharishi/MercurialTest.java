package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Mercurial;

class MercurialTest {

	@Test
	void test() {
		Mercurial mercurial = new Mercurial();
		int output1 = mercurial.isMercurial(new int[] { 1, 2, 10, 3, 15, 1, 2, 2 });
		int output2 = mercurial.isMercurial(new int[] {5, 2, 10, 3, 15, 1, 2, 2} );
		int output3 = mercurial.isMercurial(new int[] {1, 2, 10, 3, 15, 16, 2, 2});
		int output4 = mercurial.isMercurial(new int[] {3, 2, 18, 1, 0, 3, -11, 1, 3});
		int output5 = mercurial.isMercurial(new int[] {2, 3, 1, 1, 18});
		int output6 = mercurial.isMercurial(new int[] { 8, 2, 1, 1, 18, 3, 5 });
		int output7 = mercurial.isMercurial(new int[] { 3, 3, 3, 3, 3, 3 });
		int output8 = mercurial.isMercurial(new int[] { 1 });
		int output9 = mercurial.isMercurial(new int[] {});
		
		assertEquals(0, output1);
		assertEquals(1, output2);
		assertEquals(1, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
		assertEquals(1, output7);
		assertEquals(1, output8);
		assertEquals(1, output9);
	}

}
