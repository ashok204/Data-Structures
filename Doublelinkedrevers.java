package com.Arrays;

public class Doublelinkedrevers {
	Node head;
	Node current;
	void push(int data){
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
		}
		else {
			current.nextnode=n;
			n.previos=current;
			current=n;
		}
		//System.out.println("head elements:"+data);
	}
	void remove (int d) {
		Node t=null;
		Node n=head;
	while(n!=null) {
		if(n.data==d) {
			t.nextnode=n.nextnode;

			break;
		}
		t=n;
		n=n.nextnode;	
		}
	}
	

	
	void display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.nextnode;
		}
	}
	void displayReverse() {
		Node n=current;
		while(n!=null) {
			System.out.println(n.data);
			n=n.previos;
		}
	}
}


