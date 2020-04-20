/*
 * 
 * Complete the code segment to call the method  print() of class Student.
	NOTE: Don't provide any INPUT in Sample Test Cases
 * 
 */
package week2;

public class week2q1 {
	public static void main(String args[]) {
		// Create an object of class Student
		Student s = new Student();
		// Call 'print()' method of class Student
		s.print();

	}
}

class Student {
	// This is a method in class Student
	public void print() {
		System.out.println("Hi! I am class STUDENT.");
	}
}
