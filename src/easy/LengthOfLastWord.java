package easy;

public class LengthOfLastWord {
	
	public int lengthOfLastWord(String s) {
		s = s.trim();
        int spaceIdx = s.lastIndexOf(" ");
        if (spaceIdx < 0) {
        	return s.length();
        }else {
        	return s.substring(spaceIdx).length();
        }
    }
	
}
