package easy;

public class SearchInsertPosition {

	int result;
	
	public SearchInsertPosition(int[] nums, int target) {
		this.result = searchInsert(nums,target);
	}
	
	public String toString() {
		return this.result + "";
	}
	
	
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
	
	public static void main(String[] args) {
		int[] testArray = {1,3,5,6};
		int testInt = 7;
		SearchInsertPosition testCase = new SearchInsertPosition(testArray,testInt);
		System.out.println(testCase);

	}

}
