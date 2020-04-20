/*
 * Define a class Point with two fields x and y each of type double. Also , 
 * define a method distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double. 
 * Complete the code segment given below. 
 * Use Math.sqrt( ) to calculate the square root.
 * 
 */

package week3;

import java.util.Scanner;

public class week3q2 extends Point{

	private static Scanner sc;

	public static void main(String[] args) {

		 sc = new Scanner(System.in);
		 Point c=new Point(); 
		 c.x=sc.nextDouble();
		 c.y=sc.nextDouble();
		 
		 Point p=new Point();  
		 p.x=sc.nextDouble();
		 p.y=sc.nextDouble(); 
		 
		 week3q2 c1=new week3q2(); 
		 double dis=c1.distance(c,p);  
		 
		 System.out.print(dis);
		

	}

}


class Point {
	
	 double x;
	 double y;
	
	
	double distance(Point c, Point p) {
		
		double dis;
	    dis=Math.sqrt((p.x-c.x)*(p.x-c.x) + (p.y-c.y)*(p.y-c.y));
		
	    return dis;
	}
	

}

