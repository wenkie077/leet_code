package easy;

import java.util.Arrays;

public class PlusOne {

	int[] newArray;
	
	public PlusOne(int[] digits) {
		this.newArray = plusOne(digits);
	}
	
	public String toString() {
		return Arrays.toString(this.newArray);
	}
	
	public int[] plusOne(int[] digits) {
		int[] newArray = new int[digits.length + 1];
		digits[digits.length - 1] += 1;
		for(int i = digits.length - 2; i >= 0; i--) {
    	   if (digits[i + 1] == 10) {
    		   digits[i] += 1;
    		   digits[i + 1] = 0;
    	   }
		}
		if (digits[0] == 10) {
			newArray[0] = 1;
			newArray[1] = 0;
			for(int i = 1; i < digits.length; i++) {
				newArray[i + 1] = digits[i];
			}
		}else {
			newArray = digits;
		}
		return newArray;
    }
	public static void main(String[] args) {
		int[] test = {9,9,9};
		PlusOne testCase = new PlusOne(test);
		System.out.println(testCase);
	}

}
