/*
 * An interface Number is defined in the following program.  
 * You have to declare a class A, which will implement the interface Number. 
 * Note that the method findSqr(n) will return the square of the number n.
*/

package week5;

import java.util.Scanner;

interface Number {
    int findSqr(int i);  // Returns the square of n
}

class A implements Number{

	public int findSqr(int i) {
		return i*i;
	}
	
}

public class week5q1 {
	
	 private static Scanner sc;

	public static void main (String[] args){ 
	      A a = new A(); 
          sc = new Scanner(System.in);  
          int i = sc.nextInt();
          System.out.print(a.findSqr(i)); 
   } 

}
