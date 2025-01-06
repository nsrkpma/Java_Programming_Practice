package CodingProblems.Practice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StringReverse("KANE"));
		System.out.println(StringReverse2("KANE"));
		System.out.println(checkPalindrome("raceCar"));
		System.out.println(countCharacaters("aaaeergffff"));
		findDuplicates("aaaeergffff");
		System.out.println(removeDuplicate("aaaeergffff"));
		System.out.println(countofChar("aaaeergffff",'j'));
	}

	// method to reverse a string using stringBuilder
	public static String StringReverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	// method to reverse a string using for loop
	public static String StringReverse2(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

	// Method to check if an string is palindrome or not
	public static Boolean checkPalindrome(String str) {
		if (StringReverse(str).equalsIgnoreCase(str)) {
			return true;
		}
		return false;

	}

	// count of each character in an string
	public static Map<Character, Integer> countCharacaters(String str) {
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charmap.put(c, charmap.getOrDefault(c, 0) + 1);
		}
		return charmap;
	}

	// find duplicates in a string
	public static void findDuplicates(String str) {
		Map<Character, Integer> charmap = countCharacaters(str);
		System.out.println("Duplictae characters and their count is below");
		for (Map.Entry<Character, Integer> entry : charmap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
	//remove duplicates from a string
	public static String removeDuplicate(String str) {
		
		Set<Character> charset =new LinkedHashSet<>();
		for(char c:str.toCharArray()) {
			charset.add(c);
		}
		StringBuilder sb=new StringBuilder();
		for(char c:charset) {
			sb.append(c);
		}
		return sb.toString();
	}
	//count of a specific character in a String
	public static int countofChar(String str, char c) {
		int count=0;
		for(char x:str.toCharArray()) {
			if(x==c) {
				count++;
			}
		}
		return count;
	}
}
