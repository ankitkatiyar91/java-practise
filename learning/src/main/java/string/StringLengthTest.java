package com.string;

public class StringLengthTest {
	
	public static void main(String[] args) {
		String s="abc";
		char[] c= s.toCharArray();
		int i=0;
		for (char d : c) {
			System.out.println(d);
			i++;
		}
		System.out.println("Length of string-"+i);
	}

}
