package com.talentbattle.java.coding;

public class CapitalizeFirstAndLastLetterInString {
	public static void main(String[] args) {
		String str="programming",str1="";
		for(int i=0;i<str.length();i++) {
			if(i==0 || i==str.length()-1) {
				str1+=Character.toUpperCase(str.charAt(i));
			}
			else {
				str1+=str.charAt(i);
			}
		}
		System.out.println("After Changing String:"+str1);
	}
}
