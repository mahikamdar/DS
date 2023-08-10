package com.stackQueue;

import java.util.Stack;

public class CheckBrakets {

	public static void main(String[] args) {
		String s = "({1234[]})";
		if(checkBrakets(s))
			System.out.println("correct");
		else
			System.out.println("not correct");
	}

	private static boolean checkBrakets(String s) {
		Stack<Character> stack = new Stack();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ) {
				stack.push(s.charAt(i));
				continue;
			}
			 if(stack.empty())return false;
			switch(s.charAt(i)) {
			  
			case ')' : if(stack.peek()== '}' || stack.peek()== ']')
				return false;
			case '}' : if(stack.peek()== ')' || stack.peek()== ']')
				return false;
			case ']' : if(stack.peek()== ')' || stack.peek()== '}')
				return false;
			}
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' )
			stack.pop();
		}
		return true;
	}
}
