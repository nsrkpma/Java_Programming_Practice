package CodingProblems.Practice;

public class PracticeCodingProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 7, 8 ,20};
		System.out.println(sumArrayElements(arr));
		System.out.println(multiply(3, 9));
		System.out.println(multiplyWhile(3, 9));
		System.out.println(maxDifference(arr));

	}
	
	//Find the maximum difference between adjacent array elements
	public static int maxDifference(int[]arr) {
		int diff=0;
		int maxdiff=0;;
		for(int i=0;i<arr.length-1;i++) {
			diff=Math.abs((arr[i]-arr[i+1]));
			if(diff>maxdiff) {
				maxdiff=diff;
			}
		}
		return maxdiff;
	}
	
	//Find the sum of an integer array elements
	public static int sumArrayElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//Multiply two numbers without using * operator using for loop
	public static int multiply(int a, int b) {
		int result = a;
		for (int i = 1; i < b; i++) {
			result += a;
		}
		return result;
	}
	
	//Multiply two numbers without using * operator using while loop
	public static int multiplyWhile(int a,int b) {
		int result=0;
		int i=1;
		while(i<=b) {
			result+=a;
			i++;
		}
		return result;
		
	}
}
