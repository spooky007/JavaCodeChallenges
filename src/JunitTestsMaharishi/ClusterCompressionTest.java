package JunitTestsMaharishi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import maharishi.ClusterCompression;

class ClusterCompressionTest {

	@Test
	void test() {
		ClusterCompression cluster = new ClusterCompression();
		int[] output1 = cluster.clusterCompression(new int[] { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 });
		int[] output2 = cluster.clusterCompression(new int[] { 18 });
		int[] output3 = cluster.clusterCompression(new int[] {});
		int[] output4 = cluster.clusterCompression(new int[] { -5, -5, -5, -5, -5 });
		int[] output5 = cluster.clusterCompression(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1 });
		int[] output6 = cluster.clusterCompression(new int[] { 8, 8, 6, 6, -2, -2, -2 });

		assertArrayEquals(new int[] { 0, 2, 0, 2, 0, 2, 0 }, output1);
		assertArrayEquals(new int[] { 18 }, output2);
		assertArrayEquals(new int[] {}, output3);
		assertArrayEquals(new int[] { -5 }, output4);
		assertArrayEquals(new int[] { 1, 2, 1 }, output5);
		assertArrayEquals(new int[] { 8, 6, -2 }, output6);
	}

}
