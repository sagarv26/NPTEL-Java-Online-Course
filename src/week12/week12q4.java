/*
 *A program code is given to call the parent class static method and instance method in derive class without creating object of parent class. 
 *You should write the appropriate code so that the program print the contents of static method() and instance method () of parent class. 
 * 
 */

package week12;

public class week12q4 extends Parent {
	public static void testClassMethod() {
	}

	public static void main(String[] args) {

		new week12q4().testInstanceMethod();
		Parent.testClassMethod();

	}

}

class Parent {
	public static void testClassMethod() {
		System.out.println("The static method.");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method.");
	}
}