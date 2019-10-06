package easy;

public class LengthOfLastWord {

	int result;
	
	public LengthOfLastWord(String s) {
		this.result = lengthOfLastWord(s);
	}
	
	public String toString() {
		return this.result + "";
	}
	
	public int lengthOfLastWord(String s) {
		s = s.trim();
        int spaceIdx = s.lastIndexOf(" ");
        if (spaceIdx < 0) {
        	return s.length();
        }else {
        	return s.substring(spaceIdx).length();
        }
    }
	
	public static void main(String[] args) {
		String test = " hello world   ";
		LengthOfLastWord testCase = new LengthOfLastWord(test);
		System.out.println(testCase);

	}

}
