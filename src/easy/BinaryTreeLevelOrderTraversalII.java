package easy;

import java.util.List;
import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversalII {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> treeOrder = new ArrayList<>();
        if (root == null){return treeOrder;}
        List<Integer> currentOrder = new ArrayList<Integer>();
        TreeNode lastNode = root;
        TreeNode currentNode = root;
        ArrayList<TreeNode> nodeToExamine = new ArrayList<TreeNode>();
        nodeToExamine.add(root);
        while(nodeToExamine.size() > 0) {
        	currentNode = nodeToExamine.get(0);
        	currentOrder.add(currentNode.val);
        	nodeToExamine.remove(0);
        	if (currentNode.left != null) {
        		nodeToExamine.add(currentNode.left);
        	}
        	if (currentNode.right != null) {
        		nodeToExamine.add(currentNode.right);
        	}
        	if (currentNode == lastNode) {
                if (nodeToExamine.size() > 0){
                    lastNode = nodeToExamine.get(nodeToExamine.size() - 1);
                }
                treeOrder.add(0,currentOrder);
        		currentOrder = new ArrayList<Integer>();
        	}
        }
        return treeOrder;
    }
	
}
