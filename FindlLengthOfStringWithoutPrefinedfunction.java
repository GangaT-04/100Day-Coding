package com.talentbattle.java.coding;

public class FindlLengthOfStringWithoutPrefinedfunction {
	public static void main(String[] args) {
		String str="thangavelu";
		int count=0;
		char ch[]=str.toCharArray();
		for(char c:ch) {
			count++;
		}
		System.out.println(str+" contains "+count+" Letters");
	}
}
