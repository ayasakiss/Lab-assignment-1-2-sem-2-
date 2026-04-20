package labAss12_Q4;

public class Employee extends Person {
    private int employeeNum;
    private double basic;

    public Employee(String name, String address, String email, String phone, int employeeNum, double basic){
        super(name, address, email, phone);
        this.employeeNum = employeeNum;
        this.basic = basic;
        
    }
    
    public int getEmployeeNum() {
    	return employeeNum;
    }
    
    public double getbasic() {
    	return basic;
    }
    
    public String toString() {
    	return super.toString() + 
    			"\nEmployee number: " + employeeNum + 
    			"\nBasic salary: RM" + basic;
    }
    
    
    
    
    
    
}

