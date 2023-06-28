package com.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal1 {

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
	Queue<Node> q = new LinkedList<>();
	
	if(root ==null)return;
	q.add(root);
		while(!q.isEmpty()) {
			
			
			for(int i=0;i<q.size();i++) {
				Node temp = q.poll();
				System.out.print(temp.data+", ");
				if(temp.left !=null) q.add(temp.left);
				if(temp.right !=null) q.add(temp.right);
			}
		}
	
}
}
