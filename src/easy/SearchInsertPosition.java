package easy;

public class SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
		if (target < nums[0]) {
			return 0;
		}else if (target > nums[nums.length - 1]) {
			return nums.length;
		}else {
			int position;
			for (position = 0; position < nums.length; position++) {
				if (nums[position] >= target) {
					break;
				}
			}
			return position;
		}
    }
	
}
