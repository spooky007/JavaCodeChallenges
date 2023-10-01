package maharishi;

public class Upcount {

	public static void main(String[] args) {
		System.out.println(nUpCount(new int[] {2, 3, 1, -6, 8, -3, -1, 2}, 5));
		System.out.println(nUpCount(new int[] {1, 2, -1, 5, 3, 2, -3}, 20));
		System.out.println(nUpCount(new int[] {6, 3, 1}, 6));
	}
	
	public static int nUpCount(int[] a, int n) {
		int len = a.length;
		int partialSum = 0;
		int upCount = 0;
		boolean flag = true;
		for (int i = 0; i < len; i++) {
			partialSum += a[i];
			if (partialSum <= n) {
				flag = false;
			} 
			if (partialSum > n && flag == false) {
				flag = true;
				upCount++;
			}
		}
		return upCount;
	}
}
