package maharishi;

public class ClusterCompression {

	public int[] clusterCompression(int[] a) {
		if (a.length == 0) {
			return new int[] {};
		}
		int[] tempArray = new int[a.length];
		int k = 0;
		int temp = a[0];
		tempArray[k++] = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] == temp) {
				continue;
			} else {
				tempArray[k++] = a[i];
				temp = a[i];
			}
		}
		int[] cluster = new int[k];
		for (int i = 0; i < k; i++) {
			cluster[i] = tempArray[i];
		}
		return cluster;
	}
}
