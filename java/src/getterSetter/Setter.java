package getterSetter;

public class Setter {
	String empName;
	int empId;
	
	void setName(String name) {
		empName = name;
	}
	
	void setId(int id) {
		empId = id;
	}
	
	String getName() {
		return empName;
	}
	int getId() {
		return empId;
	}
}
