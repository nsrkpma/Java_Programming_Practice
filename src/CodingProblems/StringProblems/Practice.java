package CodingProblems.StringProblems;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder("JIMMY");
		System.out.println(s1.reverse());
		char[] s=s1.toString().toCharArray();
		for(char c:s) {
			System.out.println(c);
		}
		String str1="King";
		String str2="King";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
