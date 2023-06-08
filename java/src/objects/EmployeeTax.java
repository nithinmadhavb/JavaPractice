package objects;

class Tax {
	
	int taxPercentage;
	double salary;
	
	void taxPercentageCalculator(double sal) {
		salary=sal;
		taxPercentage = sal>=10000.0 ? 33: 18;
	}
	
	double taxCalculation() {
		return salary*(taxPercentage/100.0);
	}
}

public class EmployeeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tax T = new Tax();
		T.taxPercentageCalculator(10000.50);
		System.out.print("Tax amount: "+T.taxCalculation());
		
	}

}
