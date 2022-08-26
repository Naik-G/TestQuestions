package com.stringprog;

public class Stringque {

	public static void main(String[] args) {
		
		String str = "Hello welcome to india";
		String str_new=str.replaceAll(" ", "");
		System.out.println("Characters->"+str_new.length());
		String words[] = str.split("\\s"); 
		System.out.println("words->"+words.length);
	}

}
