/*
 * 
 * Complete the code segment to check whether the number is an Armstrong number or not.
 * 
 */

package week1;

import java.util.Scanner;

public class week1q4 {

	private static Scanner sc;

	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		 int n=sc.nextInt();
         int result=0;
         
  
         int temp = n, sq, sum=0;
         while(n!=0) {
        	 sq = n%10;
        	 sum = sum+(sq*sq*sq);
        	 n=n/10;
         }
         if(temp == sum) {
        	 result=1;
         }else {
        	 result=0;
         }
         
         System.out.println(result);
         
      

	}

}
