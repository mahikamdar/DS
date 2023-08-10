package com.tree.check;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckMirrorInNArray2 {

	public static void main(String[] args) {
		int N = 6;
	       
	        // Tree 1
	        int[] u1 = { 1, 1, 1, 10, 10, 10 };
	        int[] v1 = { 10, 7, 3, 4, 5, 6 };
	         
	        // Tree 2
	        int[] u2 = { 1, 1, 1, 10, 10, 10 };
	        int[] v2 = { 3, 7, 10, 6, 5, 4 };
	       
	        if(checkMirrorTree( N, u1, v1, u2, v2))
	           System.out.print("Yes");
	        else
	           System.out.print("No");
	}

	private static boolean checkMirrorTree( int n, int[] u1, int[] v1, int[] u2, int[] v2) {
		
		Map<Integer, Stack<Integer>> map = new HashMap();
		for(int i=0;i<u1.length;i++) {
			if(!map.containsKey(u1[i])) 
				map.put(u1[i], new Stack<Integer>());
			map.get(u1[i]).add(v1[i]);
		}
		
		for(int i=0;i<u2.length;i++) {
			Integer value = map.get(u2[i]).pop();
			if(value != v2[i])return false;
		}
		
		return true;
	}
}
