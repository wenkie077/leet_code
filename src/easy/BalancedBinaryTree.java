package easy;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if (root == null){return true;}
        int left = findDepth(root.left);
        int right = findDepth(root.right);
        if (Math.abs(left - right) > 1){
            return false;
        }else{
            return (isBalanced(root.left) && isBalanced(root.right));
        }       
    }
    
    public int findDepth(TreeNode root){
        if (root == null){return 0;}
        if (root.left == null && root.right == null){return 1;}
        return (Math.max(findDepth(root.left),findDepth(root.right)) + 1);
    }
}
