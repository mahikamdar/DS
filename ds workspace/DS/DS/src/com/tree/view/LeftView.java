package com.tree.view;

import com.tree.traversal.Node;

public class LeftView {

	 Node root;
	    static int max_level = 0;
	 
	    
	    void leftView()
	    {
	        
	        leftViewUtil(root, 1);
	    }
	 
	    private void leftViewUtil(Node root, int i) {
			
	    	if(root == null)return;
			if(i> max_level) {
	    	System.out.print(root.data+" ,");
	    	max_level= i;
			}
			leftViewUtil(root.left,i+1);
			leftViewUtil(root.right, i+1);
		}

		
	    public static void main(String args[])
	    {
	       
	    	LeftView tree = new LeftView();
	        tree.root = new Node(10);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(7);
	        tree.root.left.right = new Node(8);
	        tree.root.right.right = new Node(15);
	        tree.root.right.left = new Node(12);
	        tree.root.right.right.left = new Node(14);
	 
	        tree.leftView();
	    }
	
}
