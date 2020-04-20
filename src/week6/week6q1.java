/**
 * 
 * Complete the code segment to print the following using the concept of extending the Thread class in Java:

	-----------------OUTPUT-------------------
	
	Thread is Running.
	
	-------------------------------------------------
 */

package week6;


public class week6q1 extends Thread{ 
public void run() {
		System.out.print("Thread is Running.");
	}

  
  
	public static void main(String args[]){  

		// Creating object of thread class
		week6q1 thread=new week6q1();  

                // Start the thread
		thread.start();
	} 

}
