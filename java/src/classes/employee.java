package classes;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emp_name;
		int emp_id;
		float salary;
		boolean retired;
		double hours_worked;
		
		logOffTime();
		
	}

	 static void logOffTime() {
		 System.out.println(java.time.LocalTime.now());
	}

}
