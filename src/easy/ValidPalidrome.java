package easy;

public class ValidPalidrome {
	public boolean isPalindrome(String s) {
        char[] characters = s.toLowerCase().toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while(left < right){
            if (!Character.isLetterOrDigit(characters[left])){
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(characters[right])){
                right--;
                continue;
            }
            if (characters[left] == characters[right]){
                left++;
                right--;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
