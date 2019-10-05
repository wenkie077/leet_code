package easy;

public class LongestCommonPrefix {

	String commonPrefix;
	
	public LongestCommonPrefix(String[] strs) {
		this.commonPrefix = longestCommonPrefix(strs);
	}
	
	public String toString() {
		return this.commonPrefix;
	}
	
	public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
        	return strs[0];
        }else if (strs.length == 0) {
        	return "";
        }
        String commonPrefix = "";
        String str1, str2;
        for (int i = 1; i < strs.length; i++) {
        	str1 = strs[i-1];
        	str2 = strs[i];
        	commonPrefix = "";
        	for (int j = 0; j < Math.min(str1.length(), str2.length()); j++) {
        		if (str1.charAt(j) == str2.charAt(j)) {
        			commonPrefix += str1.charAt(j);
        		}else {
        			break;
        		}
        	}
        	if (commonPrefix.length() == 0) {
        		return "";
        	}
        	strs[i] = commonPrefix;
        }
		return commonPrefix;
    }
	
	
	public static void main(String[] args) {
		String[] test = {"asfa","asfasdf","asfas"};
		LongestCommonPrefix testCase = new LongestCommonPrefix(test);
		System.out.println(testCase);
	}

}
