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
		//l.delete(10);
		//l.printLs();
		l.update(30,70);
		l.printLs();
	Node node=	l.indextAt(4);
	System.out.println(node.data);
		
	}

	public Node indextAt(int i) {
		Node node = head;
		int j=0;
		while(node !=null) {
			if(j ==i)
				return node;
			node = node.next;
			j++;
		}
		return null;
	}

	public void update(int given, int update) {
		if(head ==null)return;
		Node temp = head;
		while(temp !=null && temp.data !=given)
			temp = temp.next;
		if(temp !=null && temp.data ==given)
			temp.data =update;
	}

	public void delete(int i) {
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

	public void printLs() {
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

	public void add(int i) {
		
		Node temp = new Node(i);
		if(head == null)head =temp;
		else {
			Node node =head;
			while(node.next != null)node = node.next;
			node.next = temp;
		}
	}
}
