package com.tree.check;

import com.tree.traversal.Node;

public class BalanceBinaryTree {
Node root;
public static void main(String args[])
{
	BalanceBinaryTree tree = new BalanceBinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.left.left.left = new Node(8);

    if (tree.isBalanced(tree.root))
        System.out.println("Tree is balanced");
    else
        System.out.println("Tree is not balanced");
}
private boolean isBalanced(Node root) {
	if(root == null)return true;
	
	int lh = height(root.left);
	int rh = height(root.right);
	
	if( Math.abs(rh - lh) <= 1 && isBalanced( root.left) && isBalanced(root.right))
		return true;
	return false;
}
private int height(Node root) {
	if(root == null)return 0;
	
	return Math.max(height(root.left), height(root.right))+1;
}
}
