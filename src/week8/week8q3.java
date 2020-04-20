/*
 * 
 * Write a program which will print a pyramid of "numbers" 's of height "n" and print the sum of all number's in the pyramid.

	For example:
	input: 5
	
	output: 
	        1 
	      1 2 3 
	    1 2 3 4 5 
	  1 2 3 4 5 6 7 
	1 2 3 4 5 6 7 8 9 
	95
 * 
 */
package week8;
import java.util.*;

public class week8q3 {

	private static Scanner inr;

	public static void main(String[] args) {
		inr = new Scanner(System.in);
		int n = inr.nextInt();
		
		int space = n,numbers=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<space;j++) {
				System.out.print("  ");
			}
			space-=1;
			for(int k=1;k<=i*2-1;k++) {
				System.out.print(k+" ");
				numbers+=k;
			}
			System.out.println();
		}
		System.out.print(numbers);
		
	}

}
