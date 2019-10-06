package easy;

import java.util.ArrayList;

public class PalindromeNumber {
	
	public boolean isPalindrome(int x) {
        ArrayList<Integer> digit = new ArrayList<Integer>();
        if (x < 0){
            return false;
        }else if (x < 10){
            return true;
        }else{
            while (x > 0){
                digit.add(x % 10);
                x = x / 10;               
            }
            int startidx = 0;
            int endidx = digit.size() - 1;
            while (startidx <= endidx){
                if (digit.get(startidx) != digit.get(endidx)){
                    return false;
                }else{
                    startidx ++;
                    endidx --;
                }
            }
            return true;
        }
    }

}
