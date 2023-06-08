package objects;

class Marks{
	String subject1, subject2;
	int subject1Marks, subject2Marks;
}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks marks = new Marks();
		marks.subject1 = "Maths";
		marks.subject1Marks=90;
		marks.subject2="Science";
		marks.subject2Marks=85;
		
		System.out.println("IN "+marks.subject1+" he scored: "+marks.subject1Marks);
		System.out.println("IN "+marks.subject2+" he scored: "+marks.subject2Marks);

	}
	
	

}
