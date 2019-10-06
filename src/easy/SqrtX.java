package easy;

public class SqrtX {

	public int mySqrt(int x) {
		if (x < 4 && x > 0) {return 1;}
		int root = 0;
        for (int i = 1; i <= x/2; i++) {
        	if (x/i < i) {
        		root = i - 1;
        		break;
        	}else if (x/i > i){
                root = i; 
            }else{
                root = i;
                break;
            }
        }
        return root;
    }
	
}
