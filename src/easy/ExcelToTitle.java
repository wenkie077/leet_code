package easy;

public class ExcelToTitle {
	public String convertToTitle(int n) {
        String title = "";
        while(n > 0){
            int digit = 'A' + (n - 1) % 26;
            title = (char)digit + title;
            n = (n - 1) / 26;
        }
        return title;
    }
}
