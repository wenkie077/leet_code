package easy;

public class RotateArray {
	public void rotate(int[] nums, int k) {
        int[] numsNew = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            numsNew[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            int idx = i + k;
            while (idx >= nums.length){
                idx -= nums.length;
            }
            nums[idx] = numsNew[i];
        }
    }
}
