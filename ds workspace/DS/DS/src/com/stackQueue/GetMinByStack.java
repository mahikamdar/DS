package com.stackQueue;

import java.util.Stack;

public class GetMinByStack {

	public static void main(String[] args) {
		 MinStack s = new MinStack();
	       
        
       s.push(-1);
       s.push(10);
       s.push(-4);
       s.push(0);
       System.out.println(s.getMin());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.getMin());
	}

	
}

class MinStack {
    Stack<Node> s;
 
    class Node {
        int val;
        int min;
        public Node(int val, int min)
        {
            this.val = val;
            this.min = min;
        }
    }
 
   
    public MinStack() { this.s = new Stack<Node>(); }

	public Integer pop() {
		return this.s.pop().val;
		
	}

	public Integer getMin() {
	return	this.s.peek().min;
	}

	public void push(int i) {
		if(this.s.isEmpty())
		this.s.push(new Node(i,i));
		else {
		int min = Math.min(i, this.s.peek().min);
		this.s.push(new Node(i,min));
		}
		
	}
}