package easy;

public class AddBinary {
	
	public String addBinary(String a, String b) {
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int lengthDiff = 0;
        if (aChar.length > bChar.length) {
        	lengthDiff = aChar.length - bChar.length;
        	aChar = addZero(aChar, 1);
        	bChar = addZero(bChar, lengthDiff + 1);
        }else if (aChar.length < bChar.length){
        	lengthDiff = bChar.length - aChar.length;
        	aChar = addZero(aChar, lengthDiff + 1);
        	bChar = addZero(bChar, 1);
        }else {
        	aChar = addZero(aChar, 1);
        	bChar = addZero(bChar, 1);
        }
        char[] cChar = new char[aChar.length];
        for (int i = cChar.length - 1; i > 0 ; i--) {
        	if (aChar[i] == '1') {
        		if (bChar[i] == '1') {
        			cChar[i - 1] = '1';
        			if (cChar[i] != '1'){
        				cChar[i] = '0';
        			}
        		}else {
        			if (cChar[i] == '1'){
        				cChar[i] = '0';
        				cChar[i - 1] = '1';
        			}else {
        				cChar[i] = '1';
        			}
        		}
        	}else {
        		if (bChar[i] == '1') {
        			if (cChar[i] == '1'){
        				cChar[i] = '0';
        				cChar[i - 1] = '1';
        			}else {
        				cChar[i] = '1';
        			}
        		}else {
        			if (cChar[i] != '1'){
        				cChar[i] = '0';
        			}
        		}
        	}
        }
        String output = String.valueOf(cChar);
        if (cChar[0] != '1') {
        	output = output.substring(1);
        }
        return output;
    }
	
	public char[] addZero(char[] arrayToChange, int n) {
		char[] newArray = new char[arrayToChange.length + n];
		for (int i = 0; i < newArray.length; i++) {
			if (i < n) {
				newArray[i] = '0';
			}else {
				newArray[i] = arrayToChange[i - n];
			}
		}
		return newArray;	
	}
	
}
