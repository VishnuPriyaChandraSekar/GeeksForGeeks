package com.edu.trees;

public class ConvertToDoublyList {
   TreeNode head = null;
	public void buildDoublyList(TreeNode root) {
		TreeNode[] previous = new TreeNode[2];
		inorder(root, previous);
		previous[0].right = previous[1];
		previous[1].left = previous[0];
		head = previous[1];
	}
	
	public void inorder(TreeNode root, TreeNode[] previous) {
		 if(root != null) {
			  inorder(root.left, previous);
			  root.left = previous[0];
			  if(previous[0] != null)
			  previous[0].right = root;
			  previous[0] = root;
			  if(previous[1] == null)
				  previous[1] = root;
			  inorder(root.right, previous);
		 }
	}
	
	public void displayList(TreeNode root) {
		TreeNode current = root;
		while(current.right != root) {
			System.out.print(current.val+" ");
			current = current.right;
		}
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(36);
     
        TreeNode.inorder(root);
        
        
		ConvertToDoublyList convert = new ConvertToDoublyList();
		System.out.println(" Transforming the tree");
		convert.buildDoublyList(root);
		System.out.println(" The elements in the list");
		convert.displayList(convert.head);
	}
}
