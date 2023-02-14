package com.talentbattle.java.coding;
import java.util.Scanner;
public class CheckPalindromeOrNot {
	static boolean checkPalindrome(String sen) {
		int i=0,j=sen.length()-1;
		while(i<j) {
			if(sen.charAt(i)!=sen.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if(checkPalindrome(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
