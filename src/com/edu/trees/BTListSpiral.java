package com.edu.trees;

import java.util.Stack;

public class BTListSpiral {

	TreeNode current;
    TreeNode previous = null, head = null;
	public void convertSpiral(TreeNode root) {
		Stack<TreeNode> LR = new Stack<TreeNode>();
		Stack<TreeNode> RL = new Stack<TreeNode>();
		LR.push(root);
	    
	    
	    while(!LR.empty() || !RL.empty()) {
	    	  while(!LR.empty()) {
	    		  current = LR.pop();
	    		  if(current.right != null)
	    			  RL.push(current.right);
	    		  if(current.left != null)
	    			  RL.push(current.left);
	    		  
	    		   connectNodes(current);
	    		  
	    	  }
	    	  
	    	  while(!RL.empty()) {
	    		  current = RL.pop();
	    		  if(current.left != null)
	    			  LR.push(current.left);
	    		  if(current.right != null)
	    			  LR.push(current.right);
	    		  
	    		  connectNodes(current);
	    		  
	    	  }
	    	  
	    }
	    
	    head.left = previous;
	    previous.right = head;
	    
	}
	
	public void displayList(TreeNode root) {
		TreeNode current = root;
		while(current.right != root) {
			System.out.print(current.val+" ");
			current = current.right;
		}
	}
	public void connectNodes(TreeNode current) {
		  current.left = previous;
		  if(previous == null)
			  head = current;
		  else
			  previous.right = current;
		  previous = current;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(36);
     
        TreeNode.inorder(root);
        
		BTListSpiral spiral = new BTListSpiral();
		spiral.convertSpiral(root);
		
		System.out.println(" The elements are : ");
		spiral.displayList(spiral.head);
		
		
	}

}
