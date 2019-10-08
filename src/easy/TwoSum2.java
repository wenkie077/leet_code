package easy;

public class TwoSum2 {
	public int[] twoSum(int[] numbers, int target) {
        int current = 0;
        for (int i = 1; i <= numbers.length; i++){
            current = numbers[i - 1];
            for (int j = i + 1; j <= numbers.length; j++){
                if (current + numbers[j - 1] == target){
                    int[] result = {i,j};
                    return result;
                }
            }
        }
        int[] result = new int[2];
        return result;
    }
}
