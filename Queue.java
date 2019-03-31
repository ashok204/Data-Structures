package com.Arrays;

public class Queue {
	int[] array=new int[6];
	int cursor1=0;
	int cursor2=0;
	void push(int data) {
		array[cursor1]=data;
		cursor1++;
	}
	int pop() {
		cursor2=0;
		int data=array[cursor2];
		array[cursor2]=0;
		return data;
	}

}
