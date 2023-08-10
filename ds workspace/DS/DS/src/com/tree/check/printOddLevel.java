package com.tree.check;

import com.tree.traversal.Node;

public class printOddLevel {
	Node root;
	
public static void main(String[] args) {
	printOddLevel tree = new printOddLevel();
	 tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.right = new Node(4);
     tree.root.right.left = new Node(5);
     tree.root.right.left.left = new Node(6);
     boolean oddLevel= true;
     tree.printOddLevel(tree.root,oddLevel);
}

private void printOddLevel(Node root, boolean oddLevel) {
	if(root == null) return;
	
	if(oddLevel)
	  System.out.print(root.data+ ", ");
	printOddLevel(root.left, !oddLevel);
	printOddLevel(root.right,! oddLevel);
}
}
