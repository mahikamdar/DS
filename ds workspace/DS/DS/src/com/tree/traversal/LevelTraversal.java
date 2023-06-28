package com.tree.traversal;

import java.util.Iterator;

public class LevelTraversal {
public static void main(String[] args) {
	
	Node root = new Node(20);
	root.left = new Node(8);
	root.left.left = new Node(4);
	root.left.right = new Node(12);
	root.left.right.left = new Node(10);
	root.left.right.right = new Node(14);
	root.right = new Node(22);
	root.right.right = new Node(25);
        System.out.println("expected 20,8,22,4,12,25,10,14");
       printLevel(root);
}

private static void printLevel(Node root) {
	
	int h=   height(root);
	for (int i = 1; i <= h; i++) {
		printLevel(root,i);
	}
}

private static void printLevel(Node root,int level) {
	if(root==null)
		return;

	if(level ==1)
		System.out.print(root.data+ ", ");
	else {
		printLevel(root, level-1);
		printLevel(root,level-1);
	}
}

private static int height(Node root) {
	if(root ==null)
		return 0;
	int lheight = height(root.left);
	int rheight = height(root.right);
	
	return Math.max(lheight, rheight)+1;
}


}
