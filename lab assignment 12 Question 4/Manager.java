package labAss12_Q4;

public class Manager extends Employee {
	
	private double allowance;
	
	public Manager(String name, String address, String email, String phone, int employeeNum, double basic, double allowance) {
		super(name, address, email, phone, employeeNum, basic);
		this.allowance = allowance;
	}
	
	public double getAllowance() {
		return allowance;
	}
	
	public String toString() {
    	return "MANAGER EMPLOYEE:\n" + super.toString() + 
    			"\nAllowance: RM" + allowance;
    }
	
}
