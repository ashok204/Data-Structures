package com.Arrays;

public class LinkedList {
Node head=null,current=null;
	void add(int data){
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
		}
		else {
			current.nextnode=n;
			 current=n;
		}
		System.out.println("add element="+data);
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
	}


