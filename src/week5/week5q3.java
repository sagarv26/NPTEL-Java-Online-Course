/*
 * 
 * Complete the code segment to catch the ArithmeticException in the following, if any. 
 * On the occurrence of such an exception, your program should print “Exception caught: Division by zero.” 
 * If there is no such exception, it will print the result of division operation on two integer values. 
 * 
 */

package week5;

import java.util.Scanner;

public class week5q3 {
	private static Scanner input;

	public static void main(String[] args) {
		int a, b;
		input = new Scanner(System.in);

		a = input.nextInt();
		b = input.nextInt();

		try {
			System.out.print(a / b);
		} catch (ArithmeticException e) {
			System.out.print("Exception caught: Division by zero.");
		}
	}
}
