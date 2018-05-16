package com.edu.trees;

public class LogicalBinaryTree {
 
	public TreeNode buildLogicalTree(TreeNode root) {
		if(root != null) {
			 TreeNode leftSide = buildLogicalTree(root.left);
			 TreeNode rightSide = buildLogicalTree(root.right);
			 
			 if(leftSide != null && rightSide != null)
				  root.val = (int)leftSide.val * (int)rightSide.val;
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(0);
	    root.left=new TreeNode(1);
	    root.right=new TreeNode(0);
	    root.left.left=new TreeNode(0);
	    root.left.right=new TreeNode(1);
	    root.right.left=new TreeNode(1);
	    root.right.right=new TreeNode(1);
	    System.out.println(" Before Transformation : ");
	    TreeNode.inorder(root);
	    
	    System.out.println("\n After Transformation : ");
	    LogicalBinaryTree tree = new LogicalBinaryTree();
	    tree.buildLogicalTree(root);
	    TreeNode.inorder(root);
	}
}
