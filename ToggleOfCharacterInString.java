package com.talentbattle.java.coding;

public class ToggleOfCharacterInString {
	public static void main(String[] args) {
		String str="WeLComE Hello";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if((Character.isUpperCase(str.charAt(i)))){
				str1=str1+Character.toLowerCase(str.charAt(i));
				
			}
			else {
				str1=str1+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println("Toggle String:"+str1);
	}
}
