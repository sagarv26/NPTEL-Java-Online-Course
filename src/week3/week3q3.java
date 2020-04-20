/*
A class Shape is defined with two overloading constructors in it. Another class Test1 is partially defined which inherits the class Shape. 
The class Test1 should include two overloading constructors as appropriate for some object instantiation shown in main( ) method. 
You should define the constructors using the super class constructors. 
Also, override the method calculate( ) in Test1 to calculate the volume of a Shape. 
*/

package week3;

import java.util.Scanner;
class Shape{
   double length, breadth;
   Shape(double l, double b){ //Constructor to initialize a Shape object  
      length = l;
      breadth= b;
    }
   Shape(double len){    //Constructor to initialize another Shape object  
     length = breadth = len;
   }
  double calculate(){  // To calculate the area of a shape object
    return length * breadth ;
  }
}

public class week3q3 extends Shape{
	
    double height;
	private static Scanner sc;
	week3q3(double l, double h) {
		super(l);
		height=h;
	}
	
	week3q3(double l, double b, double h) {
		super(l, b);
		height=h;
	}
	
	double calculate(){
		double area = super.calculate();
		
		return area*height;
	}

	public static void main(String args[]){
		
	sc = new Scanner(System.in);
                                                           
	double l=sc.nextDouble(); //Read length
	double b=sc.nextDouble(); //Read breadth	
	double h=sc.nextDouble(); //Read height
	
	week3q3 myshape1 = new week3q3(l,h);
	week3q3 myshape2 = new week3q3(l,b,h);
	
	double volume1;
	double volume2;
	
	volume1 = myshape1.calculate();
	volume2=myshape2.calculate();
	System.out.println(volume1);
	System.out.println(volume2);
	}
}