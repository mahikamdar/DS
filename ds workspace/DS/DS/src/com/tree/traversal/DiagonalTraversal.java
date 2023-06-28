package com.tree.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class DiagonalTraversal {
	
	Node root;
public static void main(String[] args) {
	DiagonalTraversal z =new DiagonalTraversal();
	z.root = new Node(1);	
	z.root.left = new Node(2);
	z.root.right = new Node(3);
	z.root.left.left = new Node(4);
	z.root.left.right = new Node(5);
	z.root.right.left = new Node(6);
	z.root.right.right= new Node(7);
	
	printRightRootDiagonal(z.root);
}
private static void printRightRootDiagonal(Node root) {
	
	TreeMap<Integer,List<Integer>> map = new TreeMap();
	int hd =0;
	printRightRootDiagonalUtil(root,hd,map);
	//System.out.println(map);
	TreeMap<Integer,List<Integer>> map1 = new TreeMap();
	printLeftRootDiagonalUtil(root,hd,map1);
	System.out.println(map1);
	
}
private static void printLeftRootDiagonalUtil(Node root, int hd, TreeMap<Integer, List<Integer>> map) {
	if(root ==null)return;
	List<Integer> l =null;
		if(!map.containsKey(hd)) {
			l= new ArrayList<>();
			l.add(root.data);
			map.put(hd, l);
		}else
		{
		 map.get(hd).add(root.data);
		 
		}
		printLeftRootDiagonalUtil(root.left,hd,map);
		printLeftRootDiagonalUtil(root.right,hd+1,map);
}
private static void printRightRootDiagonalUtil(Node root, int hd, TreeMap<Integer, List<Integer>> map) {
	if(root ==null)return;
List<Integer> l =null;
	if(!map.containsKey(hd)) {
		l= new ArrayList<>();
		l.add(root.data);
		map.put(hd, l);
	}else
	{
	 map.get(hd).add(root.data);
	 
	}
	printRightRootDiagonalUtil(root.left,hd+1,map);
	printRightRootDiagonalUtil(root.right,hd,map);
}
}
