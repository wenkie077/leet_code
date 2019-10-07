package easy;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {return true;}
		if (root.left == null && root.right == null) {return true;}
		if (root.left != null && root.right != null) {
			return treeCompare(root.left, root.right);
		}else {
			return false;
		}
    }
	
	public boolean treeCompare(TreeNode tree1, TreeNode tree2) {
		if (tree1 == null && tree2 == null) {
			return true;
		}else if (tree1 != null && tree2 != null) {
			if (tree1.val == tree2.val) {
				return (treeCompare(tree1.left,tree2.right) && treeCompare(tree1.right,tree2.left));
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
}
