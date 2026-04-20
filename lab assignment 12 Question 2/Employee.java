package labAss12_Q2;

public class Employee {

	private Name name;
	private String address;
	private int staffNum;
	
	public Employee(Name name, String address, int staffNum) {
		this.name = name;
		this.address = address;
		this.staffNum = staffNum;
	}
	
	public Employee() {
        this.name = null;
        this.address = "";
        this.staffNum = 0;
    }
	
	//getters
	public Name getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getStaffNum() {
		return staffNum;
	}
	
	public double calcSalary() {
		return 0.0;
	}
	
	public String toString() {
		return "Staff name: " + name +
				"\nStaff ID: " + staffNum +
				"\nStaff address: " + address;
	}
	
}
