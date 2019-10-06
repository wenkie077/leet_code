package easy;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        int currentSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] <= 0) {
        		largestSum = Math.max(largestSum, currentSum);
        		if (i > 0) {
        			if (currentSum < nums[i]) {
        				currentSum = nums[i];
        			}else {
        				currentSum += nums[i];
        			}
        		}
        	}else {
        		if (currentSum <= 0) {
        			currentSum = nums[i];
        		}else {
        			if (i > 0) {
            			currentSum += nums[i];
            		}
        		}
        	}
        	largestSum = Math.max(largestSum, currentSum);
        }
        return largestSum;
        
    }
	
}
