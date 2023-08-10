package com.tree.view;

import com.tree.traversal.Node;

public class RightView {
	Node root;
	 int max_level = 0;

	public static void main(String[] args) {
		RightView tree = new RightView();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);

		tree.rightView();
	}

	void rightViewUtil(Node node, int level) {

		if(node == null)return ;
		if(level> max_level) {
			System.out.print(node.data+" ,");
			max_level= level;
		}

		rightViewUtil(node.right,level+1);
		rightViewUtil(node.left, level+1);
	}

	void rightView() {
		rightView(root);
	}

// A wrapper over rightViewUtil()
	void rightView(Node node) {

		rightViewUtil(node, 1);
	}

}
