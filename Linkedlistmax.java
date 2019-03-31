package com.Arrays;

public class Linkedlistmax {
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
		//System.out.println("head element="+data);
	}

	int max() {
		int max=0;
		Node temp=head;
		max=head.data;
		Node n=head;
		while(temp!=null) {
			if(temp.data>max) {
				max=temp.data;
			}
			temp=temp.nextnode;
		}
		return max;
			}
		

	void display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.nextnode;
		}
		}
	}







