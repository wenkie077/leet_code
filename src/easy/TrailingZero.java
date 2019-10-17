package easy;

public class TrailingZero {
	public int trailingZeroes(int n) {
        int five = 0;
        long temp;
        for (long i = 5; i <= n; i += 5){
            temp = i / 5;
            five ++;
            while (temp % 5 == 0 && temp > 0){
                five ++;
                temp = temp / 5;
            }
        }
        return five;
    }
}
