package com.tree.traversal;

public class BoundaryTravesal {
	
	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		root.right = new Node(22);
		root.right.right = new Node(25);
	        System.out.println("expected 20,8,4,10,14,25,22");
	       printBoundary(root);
	}
	public static void printBoundary(Node root) {
		if(root ==null)return;
		System.out.print(root.data+" ");
		printLeftBoundary(root.left);
		printLeave(root.left);		
		printLeave(root.right);
		printRightBoundary(root.right);	
	}
	public static  void printRightBoundary(Node root) {
		if(root == null)return;
		//if(root.right !=null)
		printRightBoundary(root.right);
	//	else
		printRightBoundary(root.left);
		if(root.left !=null || root.right !=null)
			System.out.print(root.data+", ");
		}
	public static void printLeave(Node root) {
		if(root == null)return;
		printLeave(root.left);
		if(root.left ==null && root.right ==null)
			System.out.print(root.data+", ");
		printLeave(root.right);
	}
	public static void printLeftBoundary(Node root) {
		if(root == null)return;
		if(root.left !=null || root.right !=null)
			System.out.print(root.data+", ");
	//	if(root.left !=null)
		printLeftBoundary(root.left);
	//	else
		printLeftBoundary(root.right);
	}

}
