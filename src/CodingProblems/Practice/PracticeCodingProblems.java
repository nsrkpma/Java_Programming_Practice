package CodingProblems.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeCodingProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 7, 8 ,20};
		System.out.println(sumArrayElements(arr));
		System.out.println(multiply(3, 9));
		System.out.println(multiplyWhile(3, 9));
		System.out.println(maxDifference(arr));
		
		int[]a = {2,3,4,5,6};
		int[]b = {2,5,6,7,6};
		//System.out.println(Arrays.sort(a));
		Object[] result=compareArrays(a,b);
		System.out.println(result);
		//enhanced for loop to print array
		for(Object r:result) {
			System.out.println(r);
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}
	
	public static Object[] compareArrays(int[]a,int[]b) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		if(a.length==b.length) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				al1.add(a[i]);
			}
		}
	}
		return al1.toArray();
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
