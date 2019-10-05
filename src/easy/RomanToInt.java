package easy;

public class RomanToInt {

	int number;
	
	public RomanToInt(String s) {
		this.number = romanToInt(s);
	}
	
	public String toString() {
		return this.number + "";
	}
	
	public int romanToInt(String s) {
        char[] input = s.toUpperCase().toCharArray();
        int result = 0;
        for (int i = 0; i < input.length; i++) {
        	switch (input[i]) {
        		case 'I':
        			if (i == input.length - 1 || input[i+1] == 'I') {
        				result += 1;
        			}else {
        				result -= 1;
        			}
        			break;
        		case 'V':
        			result += 5;
        			break;
        		case 'X':
        			if (i == input.length - 1) {
        				result += 10;
        			}else {
        				if (input[i+1] == 'L'|input[i+1] == 'C') {
        					result -= 10;
        				}else {
        					result += 10;
        				}	
        			}
        			break;
        		case 'L':
        			result += 50;
        			break;
        		case 'C':
        			if (i == input.length - 1) {
        				result += 100;
        			}else {
        				if (input[i+1] == 'D'|input[i+1] == 'M') {
        					result -= 100;
        				}else {
        					result += 100;
        				}	
        			}
        			break;
        		case 'D':
        			result += 500;
        			break;
        		case 'M':
        			result += 1000;
        			break;
        	}
        }
        return result;
    }
	
	
	public static void main(String[] args) {
		String test = "MCMXCIV";
		RomanToInt testCase = new RomanToInt(test);
		System.out.println(testCase);
	}
}
