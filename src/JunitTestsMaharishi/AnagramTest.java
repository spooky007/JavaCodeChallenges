package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maharishi.Anagram;

class AnagramTest {

	@Test
	void test() {
		Anagram anagram = new Anagram();
		int output1 = anagram.areAnagrams(new char[] { 's', 'i', 't' }, new char[] { 'i', 't', 's' });
		int output2 = anagram.areAnagrams(new char[] { 's', 'i', 't' }, new char[] { 'i', 'd', 's' });
		int output3 = anagram.areAnagrams(new char[] { 'b', 'i', 'g' }, new char[] { 'b', 'i', 't' });
		int output4 = anagram.areAnagrams(new char[] { 'b', 'o', 'g' }, new char[] { 'b', 'o', 'o' });
		int output5 = anagram.areAnagrams(new char[] {}, new char[] {});
		int output6 = anagram.areAnagrams(new char[] { 'b', 'i', 'g' }, new char[] { 'b', 'i', 'g' });
		
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
		assertEquals(0, output4);
		assertEquals(1, output5);
		assertEquals(1, output6);
	}

}
