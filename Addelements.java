package com.Arrays;

import java.util.Arrays;

public class Addelements {
	String[] names = { "danu", "vinay", "ravi", "kiran" };
	int nsize = names.length;
	String[] addArr;
	void copyoriginal() {
		System.out.println("before array names display=" + Arrays.toString(names));
		addArr = new String[nsize + 3];
		for (int i = 0; i < nsize; i++) {
			addArr[i] = names[i];
		}
		System.out.println("elemants in new array=" + Arrays.toString(addArr));
		newplaces(addArr);
	}
public String[] newplaces(String[] addArra) {
		for (int i = nsize; i < addArra.length; i++) {
			addArra[nsize] = "hari";
			addArra[nsize + 1] = "krish";
			addArra[nsize + 2] = "siri";
		}
		names=addArra;
		System.out.println(Arrays.toString(names));

		return addArr;
	}
}
