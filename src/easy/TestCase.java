package easy;

import java.util.Arrays;

public class TestCase {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.left.left = new TreeNode(1);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(-1);
		root.right = new TreeNode(-3);
		root.right.left = new TreeNode(-2);
		System.out.println(PathSum.hasPathSum(root,-1));
	}
//                1
//               / \
//              -2 -3
//             / \  /
//            1  3 -2
//           /
//          -1
}
