package labAss12_Q4;

public class Secretary extends Employee {
	
	 public Secretary(String name, String address, String email, String phone, int employeeNum, double basic) {
		 super(name, address, email, phone, employeeNum, basic);
		 
	 }
	 
	 public String toString() {
		 return "SECRETARY EMPLOYEE:\n" + super.toString();
	 }
}