package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorlist {
	public static void main(String args[]) {
	List<String>user=new ArrayList<String>();
	user.add("Danu");
	user.add("mouli");
	user.add("kiran");
	Iterator<String>it=user.iterator();
	while(it.hasNext()) {
		String s=it.next();
		System.out.println(s);
	}
	for(String s:user) {
	System.out.println(s);
	}
	 

}}









