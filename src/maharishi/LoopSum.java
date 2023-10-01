package maharishi;

public class LoopSum {
	
	public static void main(String[] args) {
		System.out.println(loopSum(new int[] {-1, 2, -1}, 7));
	}

	public static int loopSum(int[] a, int n) {
		int len = a.length;
		int count = 0;
		int sum = 0;
		for (int i = 0; count < n; i++) {
			sum += a[i];
			if (i == len - 1) {
				i = -1;
			}
			count++;
		}
		return sum;
	}
}
