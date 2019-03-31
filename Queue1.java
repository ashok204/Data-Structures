package com.Arrays;

import java.util.Arrays;

public class Queue1 {

	public static void main(String[] args) {
		Queue o=new Queue();
		o.push(1);
		o.push(2);
		o.push(3);
		o.push(4);
		o.push(5);
		System.out.println("queue values");
		for(int i = 0;i<o.array.length;i++) {
			System.out.println(o.array[i]);
		}
		o.pop();
		System.out.println("elements of queue values");
			for(int i=0;i<o.array.length-1;i++) {
				o.array[i]=o.array[i+1];
		}
System.out.println(Arrays.toString(o.array));

	}

}
