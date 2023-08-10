package com.tree.check;

import com.tree.traversal.Node;

public class SumTree {

	Node root;
	 public static void main(String args[])
	    {
		 SumTree tree = new SumTree();
	        tree.root=new Node(26);
	        tree.root.left=new Node(10);
	        tree.root.right=new Node(3);
	        tree.root.left.left=new Node(4);
	        tree.root.left.right=new Node(6);
	        tree.root.right.right=new Node(3);
	 
	        if (tree.isSumTree(tree.root))
	            System.out.println("Tree is balanced");
	        else
	            System.out.println("Tree is not balanced");
	    }
	private boolean isSumTree(Node root) {
		if(root == null || root.left== null && root.right ==null) return true;
		
	int leftSum = sum(root.left);
	int rightSum = sum(root.right);
	if(root.data== (leftSum+ rightSum) && isSumTree(root.left) && isSumTree(root.right))
		return true;
		
		return false;
	}
	private int sum(Node root) {
		if(root== null) return 0;
		
		return root.data + sum(root.left)+ sum(root.right);
	}
	

}