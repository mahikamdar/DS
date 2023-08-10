package com.interview;

import java.util.HashMap;

public class Test {
	
	

	public static void main(String[] args) {
	
		HashMap<String,Integer> a = new HashMap<>();
		a.put("abc", 1);
		
		HashMap<String,Integer> b = a;
		a=null;
		b.get("abc");
		
	
	
}
}