/*
 Complete the code segment to print the current year. Your code should compile successfully.

Note: 1) In this program, you are not allowed to use any import statement. 
      2) Use should use predefined class Calendar defined in java.util package and name its object as current.
      3) No Public Test Case is given.
 
*/

package week4;

public class week4q2 {

	public static void main(String[] args) {
		int year;
		
		java.util.Calendar current = java.util.Calendar.getInstance();
	    year = current.get(java.util.Calendar.YEAR);
	    
	    System.out.println("Current Year: "+year);
	    
//	    System.out.println("Current Year: "+java.util.Calendar.getInstance().get(java.util.Calendar.YEAR));

	}

}
