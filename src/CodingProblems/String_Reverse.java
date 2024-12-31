//Java Program to reverse a String
package CodingProblems;

import java.util.Scanner;

public class String_Reverse {

	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		 System.out.println("Enter an String");
		 String userinput=myObj.nextLine();
		System.out.println(reverseString(userinput));
	}

}
