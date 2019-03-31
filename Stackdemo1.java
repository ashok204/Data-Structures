package com.Arrays;

public class Stackdemo1 {
	int[] array=new int[5];
	int cursor=-1;
	void push(int data) {
	cursor++;
	array[cursor]=data;
}
int pop(){
	int d=array[cursor];
	array[cursor]=0;
	cursor--;
	return d;
}
}
