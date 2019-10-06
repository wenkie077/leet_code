package easy;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < (m + n) && idx2 < n) {
			if (idx1 == m + idx2) {
				nums1[idx1] = nums2[idx2];
				idx1 ++;
				idx2 ++;
			}else {
				if (nums1[idx1] <= nums2[idx2]) {
					idx1 ++;
				}else {
					for (int i = m + n - 1; i >= idx1 + 1; i--) {
						nums1[i] = nums1[i - 1];
					}
					nums1[idx1] = nums2[idx2];
					idx1 ++;
					idx2 ++;
				}
			}
		}
	}
}
