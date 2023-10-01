package maharishi;

public class MinDistance {
	
	public static void main(String[] args) {
		System.out.println(minDistance(8));
	}

	public static int minDistance(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int minDistance = Integer.MAX_VALUE;
		int previousFactor = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				if (i - previousFactor < minDistance) {
					minDistance = i - previousFactor;
				}
				previousFactor = i;
			}
		}
		return minDistance;
	}
}
