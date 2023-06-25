package com.tree.traversal;

import java.util.Deque;
import java.util.LinkedList;

public class ZigZagTraversal2 {

	Node root;
	
	public static void main(String[] args) {
		ZigZagTraversal2 z =new ZigZagTraversal2();
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
		
		if(root ==null)return;
		Deque<Node> q = new LinkedList<>();
		boolean flag =false;
		q.add(root);
		while(q.size()>0) {
			System.out.print(q.peek().data);
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node temp = q.poll();
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null)q.add(temp.right);
			}
			if(flag) {
				
			}
			System.out.println();
		}
		
	}
}
