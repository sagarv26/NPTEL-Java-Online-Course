/*
 * 
 * Write a program to print symmetric Pascal's triangle of "*" 's of  height "l" of odd length . If input "l" is even then your program will print "Invalid line number".

	For example:
	
	input : 5
	output:
	  *
	 * *
	* * *
	 * *
	  *
	input : 6
	
	output:
	
	Invalid line number
 */

package week8;

import java.util.*;

public class week8q4 {

	private static Scanner inr;

	public static void main(String[] args) {
		inr = new Scanner(System.in);
		int n = inr.nextInt();
		if (n % 2 != 0) {
			for (int i = 1; i <= n / 2 + 1; i++) {
				for (int j = 1; j <= n / 2 - i + 1; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}

				System.out.println();
			}
			for (int i = n / 2; i >= 1; i--) {
				for (int j = 1; j <= n / 2 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(" *");
				}

				System.out.println();
			}
		} else {
			System.out.println("Invalid line number");
		}

	}

}
