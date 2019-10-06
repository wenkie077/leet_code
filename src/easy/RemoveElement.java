package easy;

public class RemoveElement {
	
	public int removeElement(int[] nums, int val) {
		int length = nums.length;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				nums[nums.length - 1] = -1;
				length --;
				i--;
			}
		}
		return length;
	}
	
}
