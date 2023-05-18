package com.list;

public class MyLinkedList {
Node head;
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.printLs();
		l.delete(10);
		l.printLs();
		l.update(10,70);
	}

	private void update(int i, int j) {
		
		
	}

	private void delete(int i) {
		Node temp = head;
		Node prev =null;
		while(temp != null) {
			if(temp.data ==i) {
				if(prev ==null) {
					head = temp.next;
				}else {
					prev.next = temp.next;
				}
			}
			
			prev =temp;
			temp =temp.next;
		}
		
	}

	private void printLs() {
		Node temp = head;
		while(temp !=null) {
			if(temp.next !=null)
			System.out.print(temp.data+", ");
			else {
				System.out.print(temp.data);
				System.out.println();}
			temp =temp.next;
		}
		
	}

	private void add(int i) {
		
		Node temp = new Node(i);
		if(head == null)head =temp;
		else {
			Node node =head;
			while(node.next != null)node = node.next;
			node.next = temp;
		}
	}
}
