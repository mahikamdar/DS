package com.tree.check;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.traversal.Node;

public class TwoTreeIdentical2 {
	Node root1;
	Node root2;
public static void main(String[] args) {
	TwoTreeIdentical2 tree = new TwoTreeIdentical2();
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
	if(r1 == null || r2== null)return false;
	
	Queue<Node> q1 = new LinkedList<>();
	Queue<Node> q2 = new LinkedList<>();
	q1.add(r1);
	q2.add(r2);
	
	while(!q1.isEmpty() && !q2.isEmpty()) {
		Node node1 = q1.poll();
		Node node2 = q2.poll();
		if(node1.data != node2.data)return false;
		
		if(   (node1.left != null && node2.left == null) || (node1.right != null && node2.right == null) ||
				
		      (node2.left != null && node1.left == null)|| (node2.right != null && node1.right == null)
		  )
			return false;
		
		if(node1.left != null && node2.left != null) { q1.add(node1.left); q2.add(node2.left);}
		
		if(node1.right != null && node2.right != null) { q1.add(node1.right); q2.add(node2.right);}
	}
	
	return true;
}
}
