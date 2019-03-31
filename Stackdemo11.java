package com.Arrays;

import java.util.Arrays;

public class Stackdemo11 {

	public static void main(String[] args) {
		Stackdemo1 o=new Stackdemo1();
		o.push(10);
		o.push(20);
		o.push(30);
        o.push(40);
       o.push(50);
    	System.out.println(o.pop()+"Deleted from the Stack");
    	System.out.println(o.pop());
    	System.out.println(o.pop());

System.out.println(Arrays.toString(o.array));

	}

}
