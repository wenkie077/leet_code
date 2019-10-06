package easy;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		int idx = -1;
		String[] brackets = {"()","[]","{}"};
		if (s.length() == 0) {
			return true;
		}
		if (s.length() % 2 == 1) {
			return false;
		}
		for (int i = 0; i < 3; i++) {
			idx = s.indexOf(brackets[i]);
			if (idx >= 0) {
				break;
			}
		}
		if (idx < 0) {
			return false;
		}else {
			s = s.substring(0,idx) + s.substring(idx + 2);
		}
        return isValid(s);
    }
	
}
