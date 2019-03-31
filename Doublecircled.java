package com.Arrays;

public class Doublecircled {
	Node head;
	Node current;
Node replace;
	void add(int data) {
		Node n = new Node();
		head.replace=n;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextnode = n;
			n.previos = current;
			current = n;
			//n.data = data;
			//n.nextnode=head;
		}
		//System.out.println(data);
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n=n.nextnode;
		}
		
	}
}
