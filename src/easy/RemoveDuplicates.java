package easy;

public class RemoveDuplicates {
	
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

}
