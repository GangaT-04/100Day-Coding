package com.talentbattle.java.coding;

public class RemoveBracketsFromAlgebraicExpression {

	public static void main(String[] args) {
		String expr="7x+(2*y)";
		String expr1="";
		for(int i=0;i<expr.length();i++) {
			/*if((expr.charAt(i)<='A' && expr.charAt(i)<='Z')||((expr.charAt(i)<='A' && expr.charAt(i)<='Z'))||expr.charAt(i)=='+' || expr.charAt(i)=='-' |) {
				
			}*/
			if(expr.charAt(i)=='(' || expr.charAt(i)==')') {
				continue;
			}
			else {
				expr1+=expr.charAt(i);
			}
		}
		System.out.println("Remove the bracket in Expression "+expr1);

	}

}
