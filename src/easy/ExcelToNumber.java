package easy;

public class ExcelToNumber {
	public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int digit = 1;
        for(int i = chars.length - 1; i >= 0; i--){
            sum += digit * (chars[i] - 'A' + 1);
            digit *= 26;
        }
        return sum;
    }
}
