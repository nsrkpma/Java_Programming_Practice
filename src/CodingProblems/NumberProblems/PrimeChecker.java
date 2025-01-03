package CodingProblems.NumberProblems;

import java.util.Scanner;

public class PrimeChecker {

	public static boolean primecheck(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		System.out.println(primecheck(number));

	}

}
