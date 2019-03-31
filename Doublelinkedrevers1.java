package com.Arrays;

public class Doublelinkedrevers1 {

	public static void main(String[] args) {
		Doublelinkedrevers l=new Doublelinkedrevers();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.push(50);
		l.push(60);
		l.remove(50);
		System.out.println("lements in list");
        l.display();
        System.out.println("list elemnts in reverse order ");
		l.displayReverse();


	}

}
