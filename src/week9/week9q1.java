/*
 * 
 * Complete the code to develop a BASIC CALCULATOR that can perform operations like Addition, Subtraction, Multiplication and Division.

	Note the following points carefully:
	1. Use only double datatype to store calculated numeric values.
	2. Assume input to be of integer datatype.
	3. The output should be rounded using Math.round() method.
	4. Take care of the spaces during formatting output (e.g., single space each before and after =).
	5. The calculator should be able to perform required operations on a minimum of two operands as shown in the below example:
	
	Input:
		       5+6 
	
	Output:
		       5+6 = 11
 * 
 */
package week9;
import java.util.Scanner;

public class week9q1 {
	private static Scanner sc;
    

	public static void main(String args[]){
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		String d = input.trim();
		double a =0.0 , b=0.0, res;

	    try {
             a = Double.parseDouble(d.substring(0, 1));
             b = Double.parseDouble(d.substring(2));
        } catch (NumberFormatException e) {
            
        }
	    
	    if(d.substring(1, 2).equals("+")) {
	    	res = a+b;
	    	System.out.print(d+" = "+Math.round(res));  	
	    }else if(d.substring(1, 2).equals("-")){
	    	res = a-b;
	    	System.out.print(d+" = "+Math.round(res));  
	    }else if(d.substring(1, 2).equals("*")){
	    	res = a*b;
	    	System.out.print(d+" = "+Math.round(res)); 
	    }else if(d.substring(1, 2).equals("/")){
	    	res = a/b;
	    	System.out.print(d+" = "+Math.round(res)); 
	    }
	    	
	}
}
