/*
 * 
 * Complete the code segment to find the largest among three numbers x, y, and z. You should use if-then-else construct in Java.
 * 
 */

package week1;

import java.util.Scanner;

public class week1q2 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        
        if(x > y && x > z) {
        	result=x;
        } if(y > x && y > z) { 
        	result=y;
        } if(z > y && z > x) {
        	result=z;
        }
        
        System.out.print(result);
        
        

	}

}
