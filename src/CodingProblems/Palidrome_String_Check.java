package CodingProblems;

import java.util.Scanner;

public class Palidrome_String_Check {

	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
		
	}
	public static void PalindromeCheck(String str) {
		if(str.equals(reverseString(str))) {
			System.out.println("The given String is palindrome");
		}
		else
			System.out.println("Not palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		 System.out.println("Enter an String");
		 String userinput=myObj.nextLine();
		System.out.println(reverseString(userinput));
		PalindromeCheck(userinput);
	}

}
