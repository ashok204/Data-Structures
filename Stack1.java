package com.Arrays;

public class Stack1 {

	public static void main(String[] args) {
		Stack o=new Stack();
		try {
			o.push("danu");
			o.push("mouli");
			o.push("kiran");
			o.push("dhana");
			System.out.println("stack values=");
			for(int i=0;i<o.arr.length;i++) {
				System.out.println(o.arr[i]);
			}
		
		System.out.println("remove elements names=");
		System.out.println(o.pop());
		o.pop();
		o.pop();
		o.pop();
		o.pop();
		System.out.println("stack elements after pop=");
		for(int i=0;i<o.arr.length;i++) {
			System.out.println("after pop names="+o.arr[i]);	
		}
	}
	catch(StackOverFlowException e) {
		System.out.println(e.getMessage());
	}
		catch(StackUnderFlowExceptions f) {
			System.out.println(f.getMessage());
		}
		
	}

}
