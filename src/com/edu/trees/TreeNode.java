package com.edu.trees;

public class TreeNode<T> {
    public T val;
    public TreeNode left;
    public TreeNode right;
    
    public  TreeNode(T _val) {
    	this.val =  _val;
    }
 
    
    public static void inorder(TreeNode root) {
    	 if(root != null) {
    		  inorder(root.left);
    		  System.out.print(root.val+" ");
    		  inorder(root.right);
    	 }
    }
    
    public static void preorder(TreeNode root) {
   	 if(root != null) {
  		  System.out.print(root.val+" ");
   		  preorder(root.left);
   		  preorder(root.right);
   	 }
   }
    
    public static  void postorder(TreeNode root) {
    	 if(root != null) {
    		 postorder(root.left);
    		 postorder(root.right);
    		 System.out.print(root.val+" ");
    	 }
    }
}
