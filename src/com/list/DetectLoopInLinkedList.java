package com.list;

public class DetectLoopInLinkedList {
public static void main(String[] args) {
	MyLinkedList l = new MyLinkedList();
	l.add(11);
	l.add(22);
	l.add(33);
	l.add(44);
	l.add(55);
	l.add(66);
	Node node44 = l.indextAt(3);
	Node node66 = l.indextAt(5);
	node66.next= node44;
	
	Node head = l.indextAt(0);
	findLoop(head);
	
}

private static void findLoop(Node head) {
	Node slow_move = head;
	Node fast_move= head.next;
	boolean flag =false;
	
	while(slow_move !=null && fast_move != null) {
		if(slow_move == fast_move) {
			flag =true;
			break;
		}
		slow_move =slow_move.next;
		if(fast_move.next != null)
		fast_move = fast_move.next.next;
		else {
			System.out.println("no loop is present");
			return;
		}
	}
		if(flag)System.out.println("loop detected");
		else System.out.println("no loop is present");
}
}