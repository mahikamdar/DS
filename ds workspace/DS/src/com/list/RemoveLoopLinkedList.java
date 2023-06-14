package com.list;

import java.util.HashSet;
import java.util.Set;

public class RemoveLoopLinkedList {

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
		removeLoopByHashSet(head);
		findLoopAndRemove(head);
		//findLoopAndRemove(head);
		
	}

	

	private static void findLoopAndRemove(Node head) {
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
			if(flag) {System.out.println("loop detected");
			 removeLoop(head,slow_move);
			}
			else System.out.println("no loop is present");
	}

	private static void removeLoop(Node head, Node slow_move) {
		Node node1 =slow_move;
		Node node2 = slow_move;
		while(node1 != node2.next) 
			node2 = node2.next;
		node2.next =null;
	}
	private static void removeLoopByHashSet(Node head) {
		Set<Node> h = new HashSet<>();
		Node node =head;
		Node prev =null;
		while(node != null) {
			if(!h.contains(node)) {
				h.add(node);
				
				
				prev = node;
			}else {
				prev.next = null;
				break;
			}
			node = node.next;
		}
		
	}
}
