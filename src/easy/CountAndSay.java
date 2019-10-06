package easy;

public class CountAndSay {

	String read;
	
	public CountAndSay(int n) {
		this.read = countAndSay(n);
	}
	
	public String toString() {
		return read;
	}
	
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
        return nextCount(countAndSay(n - 1));
    }
	
	public String nextCount(String thisCount) {
		char[] number = thisCount.toCharArray();
		String nextCountNumbers = "";
		int count = 0;
		char digit = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] == digit) {
				count ++;
			}else {
				nextCountNumbers += count;
				nextCountNumbers += digit;
				digit = number[i];
				count = 1;
			}
		}
		nextCountNumbers += count;
		nextCountNumbers += digit;
		return nextCountNumbers;
	}
	
	public static void main(String[] args) {
		int test = 4;
		CountAndSay testCase = new CountAndSay(test);
		System.out.println(testCase);
	}

}
