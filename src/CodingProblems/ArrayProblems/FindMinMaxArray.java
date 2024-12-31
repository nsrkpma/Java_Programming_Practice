package CodingProblems.ArrayProblems;

import java.util.Arrays;

public class FindMinMaxArray {

	public static void findMinMax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Smallest Number in array is : "+arr[0]);
		System.out.println("Largest Number in array is : "+arr[arr.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {12,34,32,223,21,343};
		findMinMax(numbers);
	}

}
