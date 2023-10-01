package maharishi;

public class MeeraArray2 {

	public static int isMeera(int[] a) {
		int len = a.length;
		boolean ninePresent = false;
		boolean onePresent = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				if (ninePresent) {
					return 1;
				}
				onePresent = true;
			}
			if (a[i] == 9) {
				if (onePresent) {
					return 1;
				}
				ninePresent = true;
			}
		}
		if (!onePresent && ninePresent || onePresent && !ninePresent) {
			return 0;
		}
		return 1;
	}
}
