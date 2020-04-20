/*
 * 
 * Complete the code segment to find the highest mark and average mark secured by Hari in "s" number of subjects.
 * 
 */
package week1;

import java.util.Scanner;

public class week1q5 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
        double mark_avg=0.0;
        int result = 0;
        int i;
        int s;
	     //define size of array
	      s = input.nextInt();
	    //The array is defined "arr" and inserted marks into it of integer type.
	     int[] arr = new int[s];   
	     
		 for(i=0;i<arr.length;i++)
		  {
	       	arr[i]=input.nextInt();
		  } 
		 
		 result=arr[0];
		 
		 for(i=0;i<arr.length;i++)
		  {
			 mark_avg+=arr[i];  
	       	if(result < arr[i]) {
	       		result=arr[i];
	       	}
		  }
		 mark_avg=mark_avg/s;
		 
		 System.out.println(result);
		 System.out.println(mark_avg);

	}

}
