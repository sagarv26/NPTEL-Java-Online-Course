/*
 * 
 * Complete the code segment to find the perimeter and area of a circle given a value of radius.
 * You should use Math.PI constant in your program.
 * If radius is zero or less than zero then print " please enter non zero positive number ".
 * 
 */

package week1;

import java.util.Scanner;

public class week1q1 {

	private static Scanner s;

	public static void main(String[] args) {
		
	s = new Scanner(System.in); 
	double radius= s.nextDouble();
	double perimeter;
	double area;
		
		
		

	if(!(radius <= 0)){
		
	   //Calculate the perimeter
	   perimeter=2*Math.PI*radius;
	   System.out.println(perimeter);
		        
       //Calculate the area
	   area = Math.PI*radius*radius;
	   System.out.println(area);

	} else {
	   System.out.println("please enter non zero positive number");
	}

	}

}
