/*
 * 
 * Write a recursive function to print the sum of  first n odd integer numbers. The recursive function should have the prototype
 " int sum_odd_n(int n) ".
	
	For example :
	
	input : 5
	output: 25 
	
	input : 6
	output : 36
 * 
 */

package week12;

import java.util.*;

public class week12q5 {
	private static Scanner in;

	static int sum_odd_n(int n) {
		if (n == 1)
			return 1;
		if (n <= 0)
			return 0;

		return (n * 2 - 1) + sum_odd_n(n - 1);
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int count = in.nextInt();
		int r = sum_odd_n(count);
		System.out.println(r);

	}

}
