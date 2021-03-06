package easy;

public class PlusOne {
	
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

}
