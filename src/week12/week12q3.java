/*
 * 
 * Write a program to create a record by taking inputs using Scanner class as 
 * first name as string ,last name as string ,roll number as integer ,subject1 mark as float,subject2 mark as float. 
 * Your program should print in the format "name  rollnumber avgmark". 
 * 
 */
package week12;

import java.util.*;

public class week12q3 {

	private static Scanner s1;

	public static void main(String[] args) {
		s1 = new Scanner(System.in);

		String firstName = s1.nextLine();
		String lastName = s1.nextLine();

		int rollNumber = s1.nextInt();
		float subMark1 = s1.nextFloat();
		float subMark2 = s1.nextFloat();

		float avg = (subMark1 + subMark2)/2;

		System.out.print(firstName + lastName + " " + rollNumber + " " + avg);

	}

}
