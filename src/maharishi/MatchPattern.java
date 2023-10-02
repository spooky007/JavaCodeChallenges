package maharishi;

public class MatchPattern {

	public static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
		int i = 0; // index into a
		int k = 0; // index into pattern
		int matches = 0; // how many times current pattern character has been matched so far
		for (i = 0; i < len; i++) {
			if (a[i] == pattern[k]) {
				matches++; // current pattern character was matched
			} else if (matches == 0 || k == patternLen - 1) {
				return 0; // if pattern[k] was never matched (matches==0) or at end of pattern
							// (k==patternLen-1)
			} else { // advance to next pattern character
				matches = 0;
				k++;
				i--;
			}
		}
			// return 1 if at end of array a (i==len) and also at end of pattern
			// (k==patternLen-1)
		if (i == len && k == patternLen - 1) {
			return 1;
		} else {
			return 0;
		}
	}
}
