package com.stackQueue;

import java.util.Stack;

public class QueueByTwoStack {
static	Stack<Integer> s1 = new Stack();
static	Stack<Integer> s2 = new Stack();
public static void main(String[] args) {
	QueueByTwoStack q = new QueueByTwoStack();
	for(int i=1;i<=10;i++)
		q.enque(i,s1,s2);
	//System.out.println(s1);
	for(int i=1;i<=10;i++)
		System.out.println(q.deque());

}
private int deque() {
	
    if (s1.isEmpty()) 
    { 
        System.out.println("Q is Empty"); 
        System.exit(0); 
    }    int x = s1.peek(); 
    s1.pop(); 
    return x; 
}

private void enque(int i,Stack<Integer> s1, Stack<Integer> s2) {
		
	while(!s1.isEmpty()) {
		s2.push(s1.pop());
	}
	s1.push(i);
	while(!s2.isEmpty()) {
		s1.push(s2.pop());
	}
}
}
