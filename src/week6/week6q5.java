/**
 * 
 * Add necessary codes to print the following:

	-----------------OUTPUT-------------------
	
	Name of thread 't':Thread-0
	
	New name of thread 't':NPTEL
	
	Thread is running.
	
	-------------------------------------------------
 * 
 */
package week6;

public class week6q5 extends Thread{  
	  public void run(){  
		    System.out.println("Thread is running.");  
		  }  
		 public static void main(String args[]){  
			 week6q5 t=new week6q5();  
		    System.out.println("Name of thread 't':"+ t.getName());  

		// Write the necessary code below...
		t.setName("NPTEL");
			    t.start();
		   System.out.println("New name of thread 't':"+ t.getName());  
		 }

}
