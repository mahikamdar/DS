package com.tree.returnsomething;

import java.util.LinkedList;
import java.util.Queue;

public class HeightI {
	Node root;
public static void main(String[] args) {
	HeightI tree = new HeightI();

	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);

//	System.out.println("Height of tree is "
//					+ tree.maxDepth(tree.root));
	tree.height(tree.root);
}
private void height(Node root2) {
	
	
}
private Integer maxDepth(Node root) {
	Queue<Node> q = new LinkedList<>();
	if(root ==null)return 0;
	int h =0;
	q.add(root);
	q.add(null);
	while(q.size()>0) {
		;
		Node temp = q.poll();
		
		if(temp==null) h++;
		if(temp !=null) {
		if(temp.left !=null)
			q.add(temp.left);
		if(temp.right != null)
			q.add(temp.right);}
		else 
			if(!q.isEmpty())q.add(null);
		
	}
	return h;
}
}
