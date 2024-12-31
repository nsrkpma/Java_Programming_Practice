package CodingProblems.StringProblems;

import java.util.HashMap; import java.util.Map;

public class DuplicatesInString {
	
	public static void FindDuplicates(String str) {
	Map<Character,Integer> charCount =new HashMap<>();
	for(char c: str.toCharArray()) {
		charCount.put(c, charCount.getOrDefault(c, 0)+1);
	}
	for(Map.Entry<Character,Integer>entry:charCount.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	}
	public static void CountOfEachCharacter(String str) {
		Map<Character,Integer> charCount =new HashMap<>();
		for(char c: str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer>entry:charCount.entrySet()) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Count of Each Character is below");
		CountOfEachCharacter("JIMMMMAYTGUSLKABOIU");
		System.out.println("Duplicate characters are below with their respective counts");
		FindDuplicates("Automaticcccccally");
	}

}
