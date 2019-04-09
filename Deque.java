package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class Deque {
	void dequeue() {
		LinkedList<String>d=new LinkedList<String>();
		d.add("apple");
		d.add("banana");
		d.add("liche");
		d.add("graps");
		d.add("orange");
		d.add("watermillon");
		d.add("greenapple");
		System.out.println("the deque values is:"+d);
		Iterator i=d.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("the deque values is :"+d.peek());
		System.out.println("after deque peek values is: "+d);
		System.out.println("the element remove from the head of dqueue:"+d.pop());
		System.out.println("after pop:"+d);
		System.out.println("the deque element 6:"+d.contains("hh"));
		d.removeFirst();
		d.removeLast();
		System.out.println("removing first and last elements:"+d);
	}

}
