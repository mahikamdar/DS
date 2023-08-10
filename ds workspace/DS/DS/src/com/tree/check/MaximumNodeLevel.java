package com.tree.check;

import java.util.HashMap;
import java.util.Map;

import com.tree.traversal.Node;

public class MaximumNodeLevel {

	public static void main(String[] args) {
		
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		root.right = new Node(22);
		root.right.right = new Node(25);
	        System.out.println("expected 20,8,22,4,12,25,10,14");
	       printLevel(root);
	}

	private static void printLevel(Node root) {
		
		int h=   height(root);
		Map<Integer, Integer> map = new HashMap();
		for (int i = 1; i <= h; i++) {
			printLevel(root,i,map,i);
		}
		System.out.println(map);
		//map.entrySet().stream().max((x,y)->x.getValue().compareTo(y.getValue())).;
	}

	private static void printLevel(Node root,int level,Map<Integer,Integer> map, int actualLevel) {
		if(root==null)
			return;

		if(level ==1) {
			
			if(!map.containsKey(actualLevel))map.put(actualLevel, 0);
			Integer data = map.get(actualLevel);
			data += 1;
			map.put(actualLevel, data);
		}
			
		else {
			printLevel(root, level-1,map,actualLevel);
			printLevel(root,level-1,map,actualLevel);
		}
	}

	private static int height(Node root) {
		if(root ==null)
			return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		return Math.max(lheight, rheight)+1;
	}

}
