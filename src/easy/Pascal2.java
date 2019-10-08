package easy;

import java.util.ArrayList;
import java.util.List;

public class Pascal2 {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> thisRow = new ArrayList<Integer>();
        List<Integer> lastRow = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++){
            lastRow = thisRow;
            thisRow = new ArrayList<Integer>();
            thisRow.add(1);
            for (int j = 1; j < i; j++){
                thisRow.add(lastRow.get(j - 1) + lastRow.get(j));
            }
            if (i > 0){
                thisRow.add(1);
            }
        }
        return thisRow;
    }
}
