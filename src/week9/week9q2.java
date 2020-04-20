/*
 * 
 * Note the following points carefully:
	1. Use only double datatype to store all numeric values.
	2. Each button on the calculator should be operated by typing the characters from 'a' to 'p'.
	3. To calculate 25-6, User should input fjhkc (where, f for 2, j for 5, h for '-', k for 6 and c for '=' ).
	3. You may use the already defined function gui_map(char).
	4. Without '=', operations won't give output as shown in Input_2 and Output_2 example below.
	5. The calculator should be able to perform required operations on two operands as shown in the below example:
	
	Input_1:
		       klgc
	
	Output_1:
			18.0
	
	Input_2:
		       klg
	
	Output_2:
 * 
 */

package week9;
import java.util.Scanner;

public class week9q2 {

	private static Scanner sc;

	public static void main(String args[]){
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] in = input.toCharArray();
		
		if(in[in.length-1]!='c') {
			System.out.print("");
		}else {
			String n="",oper="";
			int index=0;
			for(int i=0;i<in.length;i++) {
				n+=String.valueOf(gui_map(in[i]));
				if(in[i]=='d' || in[i]=='h' || in[i]=='l' || in[i]=='p') {
					index=i;
					oper = String.valueOf(gui_map(in[i]));;
				}
			}
			
			double[] num = new double[2];
			try {
				num[0] = Double.parseDouble(n.substring(0, index));
				num[1] = Double.parseDouble(n.substring(index+1,n.length()-1));	
	        } catch (NumberFormatException e) {
	            
	        }
			
		
			switch(oper){
			case "+":
				System.out.print(num[0]+num[1]);	
				break;
			case "-":
				System.out.print(num[0]-num[1]);	
				break;
			case "/":
				System.out.print(num[0]/num[1]);	
				break;
			case "X":
				System.out.print(num[0]*num[1]);	
				break;
			}
	  }
	}
	
	
	static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','.'}
					,{'b','0'}
					,{'c','='}
					,{'d','+'}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','-'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','X'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','/'}};
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}
