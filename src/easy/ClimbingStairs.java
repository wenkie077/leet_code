package easy;

public class ClimbingStairs {

	public int climbStairs(int n) {
		if (n == 1) {return 1;}
		if (n == 2) {return 2;}
        int step1 = 1;
        int step2 = 2;
        int step = 3;
        while (step <= n) {
        	step2 = step1 + step2;
        	step1 = step2 - step1;
        	step++;
        }
        return step2;
    }

}
