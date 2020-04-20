/*
This program is related to the generation of Fibonacci numbers.
For example: 0, 1, 1, 2, 3, 5, 8, 13,… is a Fibonacci sequence where 13 is the 8thFibonacci number. 
A partial code is given and you have to complete the code as per the instruction given as comments. 
*/
package week3;

import java.util.Scanner;

public class week3q1 {
	
	private static Scanner sc;
	public static void main(String args[]) { 
		 sc = new Scanner(System.in);
		 int n=sc.nextInt(); //Read an integer
	        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
	                                     //number
	    } 
	 static int fib(int n) {
		 int x0=0,x1=1,x2=0;
		 String fi="Fibonacci Sequence for number "+n+" : "+x0+" "+x1+" ";
		 
		 if(n==1) {	
			 System.out.println("Fibonacci Sequence for number "+n+" : "+x0);
			 return x0;
		 }else if(n==2) {
			 System.out.println(fi);
			 return x1; 
		 }else {
			 n=n-2;
			 while(n>0) {
				x2=x0+x1;
				x0=x1;x1=x2;
				fi+=x2+" ";
				n--;
			} 
			System.out.println(fi);
		 }
		 
		 
		 return x2;
	 }

}
