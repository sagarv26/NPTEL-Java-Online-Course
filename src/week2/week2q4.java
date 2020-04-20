/*
 * Complete the code segment to call default constructor first and then any other constructor in the class Answer.
 */
package week2;

public class week2q4 {
	
	public static void main(String[] args) {
		new Answer(10,"MCQ");
//		Answer a = new Answer();
//	    System.out.println(Answer.submit("question"));
	}
}

class Answer{
	final String q= "question";
	static String a = "answer";
	
	Answer(){
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type){	
        this();
		System.out.println("You got "+marks+" for an "+ type);
	}
	
	static String submit(String q) {
		return ("Answer for "+q+" is "+a);
	}
}


