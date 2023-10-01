package maharishi;

public class CountSquarePairs {

	public static void main(String[] args) {
		System.out.println(countSquarePairs(new int[] { 9, 0, 2, -5, 7 }));
	}

	public static int countSquarePairs(int[] a) {
		int len = a.length;
		int countPairs = 0;
		if (len < 2) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] <= 0) {
				continue;
			}
			for (int j = i + 1; j < len; j++) {
				if (a[j] <= 0) {
					continue;
				}
				if (isPerfectSquare(a[i] + a[j]) == 1) {
					countPairs++;
				}
			}
		}
		return countPairs;
	}

	public static int isPerfectSquare(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				return 1;
			}
		}
		return 0;
	}
}
