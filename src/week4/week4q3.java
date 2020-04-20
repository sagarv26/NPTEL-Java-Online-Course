/*
The program in this assignment is attempted to print the following output: 

-----------------OUTPUT-------------------

This is large
This is medium
This is small
This is extra-large

------------------------------------------

However, the code is intentionally implemented with some bugs in it. Debug the code to execute the program successfully. 
*/

package week4;


interface ExtraLarge{
	String extra = "This is extra-large";
	public void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	  super.Print();  
        System.out.println("This is medium");
    }
}

class Small extends Medium {
    public void Print() {
        super.Print(); ; 
        System.out.println("This is small");
    }
}

 
class week4q3 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
        week4q3 q = new week4q3();
	    q.display();
    }

	public void display() {
	  System.out.println(extra);	
	}
}

