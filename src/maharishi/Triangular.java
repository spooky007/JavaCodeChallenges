package maharishi;

public class Triangular {

	public static int isTriangular(int n) {
		int j = 1;
		int sum = 0;
		while (sum < n) {
			sum += j;
			j++;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}
}
