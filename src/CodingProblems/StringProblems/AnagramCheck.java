//An anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema formed from iceman. The key idea is to use all the original letters exactly once.
package CodingProblems.StringProblems;

import java.util.Arrays;

public class AnagramCheck {

	public static Boolean CheckAnagram(String str1,String str2) {
		String s1=str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String s2=str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return (Arrays.equals(arr1,arr2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CheckAnagram("cinema","icemans"));
	}

}
