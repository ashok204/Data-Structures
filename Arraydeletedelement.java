package com.Arrays;
import java.util.Arrays;
public class Arraydeletedelement {
	int[] adder= {14,25,4,5,6,9,8};
	int nsize=adder.length;
	int[] remove;
	void copymainarray() {
		System.out.println("oreginal array element="+Arrays.toString(adder));
		remove=new int[nsize-2];
		for(int i=0;i<remove.length;i++) {
			remove[i]=adder[i];
		}
		adder=remove;
		System.out.println("remove the elements print= "+Arrays.toString(adder));
		}
	}


