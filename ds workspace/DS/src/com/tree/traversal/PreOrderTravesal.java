package com.tree.traversal;

import java.util.Stack;

public class PreOrderTravesal {

	Node root;

	public static void main(String[] args) {

		PreOrderTravesal z = new PreOrderTravesal();
		z.root = new Node(1);
		z.root.left = new Node(2);
		z.root.right = new Node(3);
		z.root.left.left = new Node(4);
		z.root.left.right = new Node(5);
		z.root.right.left = new Node(6);
		z.root.right.right = new Node(7);

		printPreOrderI(z.root);
	}

	private static void printPreOrderI(Node root) {
		if(root ==null)return;
		Stack<Node> s = new Stack<>();
		
		s.add(root);
		while(s.size()>0) {
			
			root = s.pop();
			System.out.print(root.data+", ");
			if(root.right != null)s.push(root.right);
			if(root.left != null) s.add(root.left);
		}
		
	}
}
