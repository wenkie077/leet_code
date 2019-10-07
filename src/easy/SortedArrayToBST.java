package easy;

public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){return null;}
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        if (nums.length == 1){return root;}
        if (nums.length == 2){
            root.left = new TreeNode(nums[0]);
            return root;
        }
        int[] numsleft = new int[nums.length / 2];
        int[] numsright = new int[nums.length - nums.length / 2 - 1];
        for(int i = 0; i < numsleft.length; i++){
            numsleft[i] = nums[i];
        }
        for(int i = 0; i < numsright.length; i++){
            numsright[i] = nums[i + nums.length / 2 + 1];
        }
        root.left = sortedArrayToBST(numsleft);
        root.right = sortedArrayToBST(numsright);
        return root;
    }
}
