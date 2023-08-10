package com.tree.check;

import com.tree.traversal.Node;

public class TwoTreeIdentical {
	Node root1;
	Node root2;
public static void main(String[] args) {
	TwoTreeIdentical tree = new TwoTreeIdentical();
	tree.root1 = new Node(1);
    tree.root1.left = new Node(2);
    tree.root1.right = new Node(3);
    tree.root1.left.left = new Node(4);
    tree.root1.left.right = new Node(5);

    tree.root2 = new Node(1);
    tree.root2.left = new Node(2);
    tree.root2.right = new Node(3);
    tree.root2.left.left = new Node(4);
    tree.root2.left.right = new Node(5);

     
    if (tree.identicalTrees(tree.root1, tree.root2))
        System.out.println("Both trees are identical");
    else
        System.out.println("Trees are not identical");
}
private boolean identicalTrees(Node r1, Node r2) {
	if(r1 ==null && r2 == null)return true;
	if(r1 !=null && r2 !=null) {
		return (r1.data == r2.data && identicalTrees( r1.left,  r2.left) && identicalTrees( r1.right,  r2.right));
	}
	return false;
}
}
