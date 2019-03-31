package com.Arrays;

import java.util.Arrays;

public class Stackdemo {

int arr[]=new int[5];
int cursor1=0;
int cursor2=0;
void push(int data) {
	if(cursor1<arr.length) {
		arr[cursor1]=data;
		cursor2=cursor1;
		cursor1++;
	}
}
int pop() {
	if(cursor2>=0);
	int data=arr[cursor2];
	cursor1=cursor2;
	arr[cursor2]=0;
	cursor2--;
	return data;
}
public static void main(String args[]) {
	Stackdemo s=new Stackdemo();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	System.out.println(s.pop());
	System.out.println(s.pop());
    System.out.println(Arrays.toString(s.arr));
}}