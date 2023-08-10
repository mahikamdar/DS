package com.tree.check;

import com.tree.traversal.Node;

public class PrintNodeDontHaveSibiling {

	Node root;
	public static void main(String[] args) {
		PrintNodeDontHaveSibiling tree = new PrintNodeDontHaveSibiling();
		 
       
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.left.left = new Node(6);
        tree.printSingles(tree.root);
	}
	private void printSingles(Node root) {
		if(root ==null || (root.left ==null && root.right == null)  )
			return;
		
		
		if(root.left != null && root.right != null) {
			printSingles(root.left);
			printSingles(root.right);
		}
		else
		if(root.left != null) {
			System.out.print(root.left.data+" ");
			printSingles(root.left);
			
		}
		else
		if(root.right !=null) {
			System.out.print(root.right.data+" ");
			printSingles(root.right);
		}
		
	}
}
