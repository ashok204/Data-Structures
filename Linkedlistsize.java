package com.Arrays;

public class Linkedlistsize {Node head=null,current=null;
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
int size() {
	int size=0;
	Node temp=head;
	while(temp!=null) {
		size++;
		temp=temp.nextnode;
	}
	return size;
}
}
