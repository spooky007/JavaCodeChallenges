package maharishi;

public class Anagram {
	
	public static int areAnagrams(char[] a1, char [] a2) {
		if (a1.length != a2.length) {
			return 0;
		}
		for (int i = 0; i < a1.length; i ++) {
			boolean found = false;
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == (a2[j])) {
					found = true;
					break;
				}
			}
			if (found == false) {
				return 0;
			}
		}
		return 1;
	}
}
