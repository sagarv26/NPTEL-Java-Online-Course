/*
 * Complete the code segment to call the default method in the interface First and Second.
 */

package week4;

interface First{ 
    // default method 
    default void show(){ 
        System.out.println("Default method implementation of First interface."); 
    } 
} 
  
interface Second{ 
    // Default method 
    default void show(){ 
        System.out.println("Default method implementation of Second interface."); 
    } 
} 
  
// Implementation class code 
class week4q4 implements First, Second{ 
    // Overriding default show method 
    public void show(){
    	First.super.show();
    	Second.super.show();
    	   	
    } 
    
    public static void main(String args[]){ 
    	week4q4 q = new week4q4(); 
        q.show(); 
    } 
}
