package easy;

public class TwoSum {
	
	int[] resultArray = new int[2];
	
	// Constructor
	public TwoSum(int[] nums, int target) {
		resultArray = this.twoSum(nums, target);
	}
	
	// toString
	public String toString() {
		return (this.resultArray[0] + " " + this.resultArray[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int idx = 0; idx < nums.length; idx++){
            for (int idx2 = idx + 1; idx2 < nums.length; idx2++){
                if (nums[idx] + nums[idx2] == target){
                    result[0] = idx;
                    result[1] = idx2;
                    return result;
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] testArray = new int[]{2,7,11,15};
		int testTarget = 9;
		TwoSum test = new TwoSum(testArray, testTarget);
		System.out.println(test);
	}

}
