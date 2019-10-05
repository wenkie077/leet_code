package easy;

import java.util.Arrays;

public class RemoveDuplicates {

	int length;
	
	public RemoveDuplicates(int[] nums) {
		this.length = removeDuplicates(nums);
	}
	
	public String toString() {
		return this.length + "";
	}
	
	public int removeDuplicates(int[] nums) {
		if (nums.length <= 1) {
			return nums.length;
		}
        int changed = 0;
        int compared = 1;
        while(compared < nums.length) {
        	if (nums[changed] == nums[compared]) {
        		compared ++;
        	}else {
        		nums[changed + 1] = nums[compared];
        		changed ++;
        		compared ++;
        	}
        }
        return (changed + 1);
    }
	
	public static void main(String[] args) {
		int[] test = {0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicates testCase = new RemoveDuplicates(test);
		System.out.println(testCase);
		System.out.println(Arrays.toString(test));

	}

}
