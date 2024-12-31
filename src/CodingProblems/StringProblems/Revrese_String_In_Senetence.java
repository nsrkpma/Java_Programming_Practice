//Write a program to reverse each word in a String
package CodingProblems.StringProblems;

import java.util.Scanner;

public class Revrese_String_In_Senetence {
	
	public static String reverseString(String str) {
		String[] words=str.split(" ");
		StringBuilder reversedString=new StringBuilder();
		for(String word : words) {
			StringBuilder reversedword=new StringBuilder(word);
			reversedString.append(reversedword.reverse()).append(" ");
		}
		return reversedString.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("Enter an String");
		 String userinput=myObj.nextLine();
		System.out.println(reverseString(userinput));
		

	}

}
