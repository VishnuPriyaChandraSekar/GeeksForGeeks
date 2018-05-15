package com.edu.trees;

import java.util.Stack;

public class TernaryExpression {
   
	/* Convert Ternary Expression to a Binary Tree
	 * 
	 * 	Input :  string expression =   a?b:c 
		Output :        a
              /  \
             b    c

		Input : expression =  a?b?c:d:e
		Output :       a
           			 /  \
          			b    e
        		   /  \
                  c    d
	 * 
	 * 
	 */
	public TreeNode buildTree(String str) {
		Stack<TreeNode> stk = new Stack<TreeNode>();
		TreeNode node = new TreeNode(str.charAt(0));
		TreeNode head = node;
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == '?')
				stk.push(node);
			else if(str.charAt(i) != '?' && str.charAt(i) != ':') {
				 if(str.charAt(i-1) == '?') {
					 node = new TreeNode(str.charAt(i));
					 stk.peek().left = node;
				 }
				 else {
					 node = stk.pop();
					 node.right = new TreeNode(str.charAt(i));
				 }
			}
		
		}
		
		return head;
	}
}
