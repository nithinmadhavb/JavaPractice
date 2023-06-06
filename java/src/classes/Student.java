package classes;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studentName;
		int studentID;
		int age;
		float fee;
		boolean graduation;
		int subject1Marks = 90, subject2Marks = 23;
		
		System.out.println("Total marks: "+gradeCalculation(subject1Marks, subject2Marks));
		averageCalculator(subject1Marks, subject2Marks);
		
	}

	static void averageCalculator(int subject1Marks, int subject2Marks) {
		// TODO Auto-generated method stub
		System.out.print("Average score: "+(subject1Marks + subject2Marks)/2);
	}

	static int gradeCalculation(int subject1Marks, int subject2Marks) {
		// TODO Auto-generated method stub
		return subject1Marks + subject2Marks;
	}

}
