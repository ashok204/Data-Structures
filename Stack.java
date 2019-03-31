package com.Arrays;

public class Stack {
	String[] arr=new String[4];
	int cursor=0;
	void push(String data)throws StackOverFlowException{
		if(cursor<arr.length) {
			arr[cursor]=data;
			cursor++;
		}
		else {
			StackOverFlowException e=new StackOverFlowException("stack memory value executed");
			throw e;
		}
	}
	String pop()throws StackUnderFlowExceptions{
		if(cursor>0) {
			cursor--;
			String data =arr[cursor];
			arr[cursor]=null;
		
			return data;
		}else {
			StackUnderFlowExceptions y=new StackUnderFlowExceptions("under stack values");
			throw y;
		}
		
		
	}

}
