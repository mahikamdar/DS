package com.tree.traversal;

import java.util.Stack;

public class PostOrderTraversal {
	Node root;

	public static void main(String[] args) {

		PostOrderTraversal z = new PostOrderTraversal();
		z.root = new Node(1);
		z.root.left = new Node(2);
		z.root.right = new Node(3);
		z.root.left.left = new Node(4);
		z.root.left.right = new Node(5);
		z.root.right.left = new Node(6);
		z.root.right.right = new Node(7);

		printPostOrderI(z.root);
	}

	private static void printPostOrderI(Node root) {

		if (root == null)
			return;
		Stack<Node> s = new Stack<Node>();
		boolean notVisited = true;

		while (true) {			
			while (root != null && notVisited) {
				s.push(root);
				root = root.left;
			}
			if (s.isEmpty())break;

			if (root != s.peek().right ) {
				root = s.peek().right;
				notVisited= true;
				continue;
			} else {

				root = s.pop();
				System.out.print(root.data + " ,");
				notVisited = false;
			}
		}

	}
}
