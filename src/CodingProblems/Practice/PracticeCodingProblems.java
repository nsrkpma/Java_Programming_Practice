package CodingProblems.Practice;

public class PracticeCodingProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(sumArrayElements(arr));
		System.out.println(multiply(3, 9));

	}

	public static int sumArrayElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int multiply(int a, int b) {
		int result = a;
		for (int i = 1; i < b; i++) {
			result += a;
		}
		return result;
	}
}
