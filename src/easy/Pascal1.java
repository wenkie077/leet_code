package easy;

import java.util.ArrayList;
import java.util.List;

public class Pascal1 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if (numRows == 0){return pascal;}
        int currentLevel = 0;
        List<Integer> current = new ArrayList<Integer>();
        List<Integer> last = new ArrayList<Integer>();
        int left;
        int right;
        while(currentLevel < numRows){
            current.add(0,1);
            for (int i = 1; i < currentLevel; i++){
                left = last.get(i - 1);
                right = last.get(i);
                current.add(i,left + right);
            }
            if (currentLevel != 0){
                current.add(1);
            }
            currentLevel ++;
            pascal.add(current);
            last = current;
            current = new ArrayList<Integer>();
        }
        return pascal;
    }
}
