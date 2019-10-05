package easy;

public class ImplementStr {

	int index;
	
	public ImplementStr(String haystack, String needle) {
		this.index = strStr(haystack,needle);
	}
	
	public String toString() {
		return index + "";
	}
	
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
	
	public static void main(String[] args) {
		String test1 = "mississippi";
		String test2 = "issip";
		ImplementStr testCase = new ImplementStr(test1, test2);
		System.out.println(testCase);
	}
}
