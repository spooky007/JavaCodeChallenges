package maharishi;

public class Vesuvian {

	public static int isVesuvian(int n) {
		int sumCount = 0;
		for (int i = 1; i < n; i++) {
			if (isSquare(i)) {      // only proceed if i is a square
				for (int j = i; j < n; j++) {
					if (isSquare(j)) {  // on proceed is j is a square
						if (i + j == n) {
							sumCount++;
							if (sumCount == 2) {
								return 1;
							}
							break;
						}
					}
				}
			} 
		}
		return 0;
	}
	
	public static boolean isSquare(int n) {
		if (n == 1) {
			return true;
		}
		int square = 0;
		for (int i = 0; i * i <= n; i++) {
			square = i * i;
			if (square == n) {
				return true;
			}
		}
		return false;
	}
}
