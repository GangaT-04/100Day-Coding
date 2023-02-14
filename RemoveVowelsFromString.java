package com.talentbattle.java.coding;

public class RemoveVowelsFromString {
	public static void main(String[] args) {
		String str="welcome to gce";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' ||str.charAt(i)==' ') {
				continue;
			}
			else {
				str1=str1+str.charAt(i);
			}
		}
		System.out.println("After remove vowels String:"+str1);
	}
}
