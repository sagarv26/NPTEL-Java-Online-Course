/*
 * 
 * In the following program, an array of integer data to be initialized. 
 * During the initialization, if a user enters a value other than integer value, then it will throw InputMismatchException exception. 
 * On the occurrence of such an exception, your program should print “You entered bad data.” 
 * If there is no such exception it will print the total sum of the array.
 * 
 */

package week5;

import java.util.*;

public class week5q4 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int length = sc.nextInt();
		int sum = 0;// save the total sum of the array.
		boolean thrown = false;

		for (int i = 0; i < length; i++) {
			try {
				sum += sc.nextInt();
			} catch (Exception ex) {
				thrown = true;
				System.out.print("You entered bad data.");
			}
		}

		if (!thrown) {
			System.out.print(sum);
		}
	}
}