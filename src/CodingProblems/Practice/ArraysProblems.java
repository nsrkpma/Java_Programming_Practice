package CodingProblems.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {11,3,23,244,12,123,2,4,56,273};
		findMinMax(arr);
		findSecondLargest(arr);
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(10);
		al1.add(220);
		al1.add(20);
		al1.add(30);
		al1.add(30);
		al1.add(10);
		System.out.println(al1);
	}
	//find min and max in an array
	public static void findMinMax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Max = "+arr[arr.length-1]);
		System.out.println("Min = "+arr[0]);
	}
	public static void findSecondLargest(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Second Largest element is = "+arr[arr.length-2]);
	}
	//remove duplicate from arraylist
	public static void removeDuplicatesfromArrayList(List<Integer> al1) {
		
	}

}
