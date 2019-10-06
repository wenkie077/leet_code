package easy;

public class ImplementStr {
	
	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        int compare = -1;
        boolean found = true;
        for (int i = 0; i < haystackChar.length; i++) {
        	found = true;
        	if (haystackChar.length - i < needleChar.length) {
        		break;
        	}
        	if (haystackChar[i] == needleChar[0]) {
        		for (int j = 0; j < needleChar.length; j++) {
        			if (haystackChar[i + j] != needleChar[j]) {
        				found = false;
        			}
        		}
        		if (found) {
        			compare = i;
        			break;
        		}
        	}
        }
        return compare;
    }

}
