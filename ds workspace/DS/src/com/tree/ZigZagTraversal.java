package com.tree;

import java.util.Stack;

public class ZigZagTraversal {

	Node root;
	
	public static void main(String[] args) {
		ZigZagTraversal z =new ZigZagTraversal();
		z.root = new Node(1);	
		z.root.left = new Node(2);
		z.root.right = new Node(3);
		z.root.left.left = new Node(4);
		z.root.left.right = new Node(5);
		z.root.right.left = new Node(6);
		z.root.right.right= new Node(7);
		
		printZigZag(z.root);
		
	}

	private static void printZigZag(Node root) {
		
		if(root == null)return;
		Stack<Node> currLevel = new Stack<Node>();
		Stack<Node> nextLevel = new Stack<Node>();
		boolean flag= true;
		currLevel.push(root);
		while(!currLevel.isEmpty()) {
			Node node = currLevel.pop();
			System.out.print(node.data+", ");
			if(flag) {
			if(node.left != null) nextLevel.add(node.left);
			if(node.right != null ) nextLevel.add(node.right);
			}
			else {
				if(node.right != null ) nextLevel.add(node.right);
				if(node.left != null) nextLevel.add(node.left);
			}
			if(currLevel.isEmpty()) {
				flag = !flag;
				Stack<Node> temp = currLevel;
				currLevel = nextLevel;
				nextLevel =temp;
			}
		}
		
	}
}
