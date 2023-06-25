package com.tree.traversal;

import java.util.Stack;

public class InorderTravesal {
	
	Node root;
public static void main(String[] args) {
	
	InorderTravesal z =new InorderTravesal();
	z.root = new Node(1);	
	z.root.left = new Node(2);
	z.root.right = new Node(3);
	z.root.left.left = new Node(4);
	z.root.left.right = new Node(5);
	z.root.right.left = new Node(6);
	z.root.right.right= new Node(7);
	
	printInOrder(z.root);
	printInOrderI(z.root);
}

//go left and pop element when null or leaves come and then 
// move to right
private static void printInOrderI(Node root) {
	
	if(root ==null)
		return;
	Stack<Node> s = new Stack<Node>();
	
	while(true) {
		if(root != null) {
			s.push(root);
			root =root.left;
		}else {
			if(s.isEmpty())break;
		root=s.pop();
			System.out.print(root.data+", ");
			
			root =root.right;
		}
	}
	
}
private static void printInOrder(Node root) {
	if(root ==null)return;
	printInOrder(root.left);
	System.out.print(root.data+" ");
	printInOrder(root.right);
	
}
}
 