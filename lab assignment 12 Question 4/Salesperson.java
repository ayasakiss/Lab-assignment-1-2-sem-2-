package labAss12_Q4;

public class Salesperson extends Employee {
	private double commission;
	
	public Salesperson(String name, String address, String email, String phone, int employeeNum, double basic, double commission) {
		super(name, address, email, phone, employeeNum, basic);
		this.commission = commission;
	}
	
	public double getCommission() {
		return commission;
	}
	
	public String toString() {
    	return "SALESPERSON EMPLOYEE:\n" + super.toString() + 
    			"\nCommission: RM" + commission;
    }
}