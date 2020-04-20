/*
 * 
 * Complete the following code fragment to read three integer values from the keyboard and find the sum of the values. 
 * Declare a variable "sum" of type int and store the result in it.
 * 
 */

package week7;
import java.util.Scanner;

public class week7q1 {
	 static Scanner sc;
	public static void main (String[] args){

		     sc  = new Scanner(System.in);
		     int a = sc.nextInt();
		     int b = sc.nextInt();
             int c = sc.nextInt();
		          
             int sum = a+b+c;
		     System.out.println(sum);
	}

}
