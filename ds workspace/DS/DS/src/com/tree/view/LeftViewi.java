package com.tree.view;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.traversal.Node;

public class LeftViewi {
	 Node root;
	 public static void main(String[] args) {
		 LeftViewi tree = new LeftViewi();
	        tree.root = new Node(10);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(7);
	        tree.root.left.right = new Node(8);
	        tree.root.right.right = new Node(15);
	        tree.root.right.left = new Node(12);
	        tree.root.right.right.left = new Node(14);
	 
	        tree.leftView(tree.root);
	}
	private void leftView(Node root) {
		
		if(root == null) return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			int n = q.size();
			for(int i=0;i<n;i++) {
				Node temp = q.poll();
				if(i==0)
				System.out.print(temp.data+" ,");
				if(temp.left != null)q.add(temp.left);
				if(temp.right != null ) q.add(temp.right);
				
			}
			 
		}
		
	}
}
