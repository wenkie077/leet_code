package easy;

public class ReverseInteger {
	
	public int reverse(int x) {
        String xStr = "" + x;
        String reversed = "";
        int startIdx = 0;
        int endIdx = xStr.length() - 1;
        char[] numbers = xStr.toCharArray();
        if (numbers[0] == '-') {
        	startIdx = 1;
        	reversed += "-";
        }
        char temp;
        if (startIdx == endIdx) {
        	reversed += numbers[startIdx];
        	return (Integer.parseInt(reversed));
        }
        int start = startIdx;
        while (start < endIdx) {
        	temp = numbers[start];
        	numbers[start] = numbers[endIdx];
        	numbers[endIdx] = temp;
        	start ++;
        	endIdx --;
        }
        reversed += String.valueOf(numbers).substring(startIdx);
        int output = 0;
        try{
            output = Integer.parseInt(reversed);
        }catch(Exception e){
            return 0;
        }
        return output;
    }
	

}
