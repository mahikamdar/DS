package com.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
static Queue<Integer> q1 = new LinkedList();
static Queue<Integer> q2 = new LinkedList();

	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		
		for(int i=0;i<=10;i++) {
		    s.push(i);
		}
		System.out.println(q1);
	}
 
	private void push(int i) {
		while(!q1.isEmpty())
			q2.add(q1.poll());
		q1.add(i);
		while(!q2.isEmpty())
			q1.add(q2.poll());
		
	}
}
