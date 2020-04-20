/*
 * 
 *	Write a program which will print a pascal  pyramid of  "*" 's of height "l" .

	For example:
	input: 8
	
	output :
	       * 
	      * * 
	     * * * 
	    * * * * 
	   * * * * * 
	  * * * * * * 
	 * * * * * * * 
	* * * * * * * *  
 * 
 */


package week8;

import java.util.*;

public class week8q2 {

	private static Scanner inr;

	public static void main(String[] args) {
		inr = new Scanner(System.in);
		int n = inr.nextInt();

		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=n-i; j++) 
			{
				System.out.print(" "); 
			}
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}

			System.out.println(); 
		}

	}

}
