package easy;

public class ReverseInteger {
	
	long reversed = 0;
	
	public ReverseInteger(long x) {
		this.reversed = reverse(x);
	}
	
	public String toString() {
		return (this.reversed + "");
	}
	
	public long reverse(long x) {
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
        return (Long.parseLong(reversed));
    }
	
	
	public static void main(String[] args) {
		long testInt = 9646324351l;
		ReverseInteger test = new ReverseInteger(testInt);
		System.out.println(test);
	}

}
