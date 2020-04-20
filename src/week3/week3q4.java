/*
This program to exercise the call of static and non-static methods. A partial code is given defining two methods, namely sum( ) and multiply ( ). 
You have to call these methods to find the sum and product of two numbers. Complete the code segment as instructed.   
*/

package week3;

import java.util.Scanner;
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}

public class week3q4 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		System.out.println(new QuestionScope().sum(n1, n2));
		System.out.print(QuestionScope.multiply(n1, n2));

	}

}
