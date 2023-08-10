package com.tree.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tree.traversal.Node;

public class BottomView {

	Node root;
	   public static void main(String args[])
	    {
	       
		   BottomView tree = new BottomView();
	        tree.root = new Node(10);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(7);
	        tree.root.left.right = new Node(8);
	        tree.root.right.right = new Node(15);
	        tree.root.right.left = new Node(12);
	        tree.root.right.right.left = new Node(14);
	 
	        tree.bottomView();
	    }
	private void bottomView() {
		Map<Integer,List<Integer>> map = new TreeMap<>();
		int hd =0;
		printbottomView(root,hd,map);
	//	System.out.println(map);
		List<Collection<List<Integer>>> list = Stream.of(map).flatMap(x->Stream.of(x.values())).collect(Collectors.toList());
		//System.out.println(list);
		list.stream().flatMap(a->a.stream()).forEach(b->System.out.print(b.get(b.size()-1)+"  "));
		
		
	}
	private void printbottomView(Node root, int hd, Map<Integer, List<Integer>> map) {
		if(root == null)return;
		
		if(!map.containsKey(hd)) {
			List<Integer>	 l = new ArrayList<>();
			l.add(root.data);
			map.put(hd, l);
		}else
			map.get(hd).add(root.data);
		
		printbottomView(root.left,hd-1,map);
		printbottomView(root.right,hd+1,map);
	}
}
