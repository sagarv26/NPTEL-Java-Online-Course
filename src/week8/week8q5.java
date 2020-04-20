/*
 * 
 * Write a program to display any digit(n) from 0-9 using "7 segment  display". 
	
	For example:
	input : 5
	
	output :
	 _ 
	|_ 
	 _|
	
	input : 4
	
	output :
	
	|_|
	  |

 * 
 */

package week8;
import java.util.*;

public class week8q5 {

	private static Scanner inr;

	public static void main(String[] args) {
		inr = new Scanner(System.in);
	    int n = inr.nextInt();
	    int[] arr = new int[9];
	    boolean[] b = new boolean[9];
	    
	    switch(n) {
	    case 1:
	    	b[0]=false;b[1]=false;b[2]=false;
	    	b[3]=false;b[4]=false;b[5]=true;
	    	b[6]=false;b[7]=false;b[8]=true;
	    	break;
	    case 2:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=false;b[4]=true;b[5]=true;
	    	b[6]=true;b[7]=true;b[8]=false;
	    	break;
	    case 3:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=false;b[4]=true;b[5]=true;
	    	b[6]=false;b[7]=true;b[8]=true;
	    	break;
	    case 4:
	    	b[0]=false;b[1]=false;b[2]=false;
	    	b[3]=true;b[4]=true;b[5]=true;
	    	b[6]=false;b[7]=false;b[8]=true;
	    	break;
	    case 5:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=true;b[4]=true;b[5]=false;
	    	b[6]=false;b[7]=true;b[8]=true;
	    	break;
	    case 6:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=true;b[4]=true;b[5]=false;
	    	b[6]=true;b[7]=true;b[8]=true;
	    	break;
	    case 7:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=false;b[4]=false;b[5]=true;
	    	b[6]=false;b[7]=false;b[8]=true;
	    	break;
	    case 8:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=true;b[4]=true;b[5]=true;
	    	b[6]=true;b[7]=true;b[8]=true;
	    	break;
	    case 9:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=true;b[4]=true;b[5]=true;
	    	b[6]=false;b[7]=true;b[8]=true;
	    	break;
	    case 0:
	    	b[0]=false;b[1]=true;b[2]=false;
	    	b[3]=true;b[4]=false;b[5]=true;
	    	b[6]=true;b[7]=true;b[8]=true;
	    	break;
	    }
	    
	    for(int i=0;i< arr.length;i=i+3) {
	    	
	    	if(b[i]) {
	    		System.out.print("|");
	    	}else {
	    		System.out.print(" ");
	    	}
	    	
	    	if(b[i+1]) {
	    		System.out.print("_");
	    	}else {
	    		System.out.print(" ");
	    	}
	    	
	    	
	    	if(b[i+2]) {
	    		System.out.println("|");
	    	}else {
	    		System.out.println(" ");
	    	}
	    	

	    }

	}

}
