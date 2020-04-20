/**
 * The following program reads a string from the keyboard and is stored in the String variable "s1". 
 * You have to complete the program so that it should should print the number of vowels in s1 . 
 * If your input data doesn't have any vowel it will print "0".
 * 
 */

package week7;
import java.io.*;
import java.util.*;

public class week7q4 {

	public static void main(String[] args) {
		 int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
            char[] ch = s1.toLowerCase().toCharArray();
            for(int i = 0; i < ch.length;i++) {
            	if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
            		c++;
            	}
            	
            }
            
            System.out.println(c); 
  	   }
         catch (Exception e){
  		 System.out.println(e);
  	    }

	}

}
