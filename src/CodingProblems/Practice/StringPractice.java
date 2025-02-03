package CodingProblems.Practice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="a b c d";
		ReverseString(s1);
		
	}
	public static void ReverseString(String str) {
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}

}
