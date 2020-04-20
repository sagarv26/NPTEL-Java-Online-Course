/*
 * 
 * Consider first n even numbers starting from zero(0).
 * Complete the code segment to calculate sum of  all these numbers divisible by 3 . Print the sum.

	Example:
	
	Input: n = 5
	
	-------
	0 2 4 6 8
	Even number divisible by 3:0 6
	sum:6
 * 
 */

package week1;

import java.util.Scanner;

public class week1q3 {

	private static Scanner sc;

	public static void main(String[] args) {
		   sc = new Scanner(System.in);
		   int n=sc.nextInt();
		   int sum=0;
		  
		   for(int i=1,a=0;i<=n;i++,a=a+2) {
			  if(a%3==0) {
				  sum +=a;  
			  }
		   }
		   System.out.println(sum);
   
	}
}
