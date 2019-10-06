package easy;

import java.util.Arrays;

public class TestCase {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,4,5};
		int m = 3;
		int n = 3;
		MergeSortedArray.merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(nums1));
	}

}
