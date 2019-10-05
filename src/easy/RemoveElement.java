package easy;

import java.util.Arrays;

public class RemoveElement {

	int length;
	
	public RemoveElement(int[] nums, int val) {
		this.length = removeElement(nums,val);
	}
	
	public String toString() {
		return this.length + "";
	}
	
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
	
	public static void main(String[] args) {
		int[] test = {0,0,1,1,1,2,2,3,3,4};
		int testVal = 1;
		RemoveElement testCase = new RemoveElement(test,testVal);
		System.out.println(testCase);
		System.out.println(Arrays.toString(test));

	}

}
