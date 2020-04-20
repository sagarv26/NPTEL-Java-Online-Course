/*
 * Complete the code segment to call print() method of class Question by creating a method named ‘studentMethod()’.
 */
package week2;

public class week2q3 {

	public static void main(String[] args) { 
		
		week2q3 q = new week2q3();
		
		q.studentMethod();
    }
	

	void print(week2q3 object){
		System.out.print("Well Done!");
	}
	
	private void studentMethod() {
		week2q3 q = new week2q3();
		q.print(this);
			
	}

}
