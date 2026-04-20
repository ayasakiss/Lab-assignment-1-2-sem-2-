package labAss12_Q2;

public class Hourly extends Employee {
	private double wages;
	private int hours; 
	private double salary;
	
	public Hourly(Name name, String address, int staffNum, double wages, int hours) {
		super(name, address, staffNum);
		this.wages = wages;
		this.hours = hours;
	}
	
	public double getWages() {
		return wages;
	}
	
	public double getHours() {
		return hours;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double calcSalary() {
		
		if (hours > 40) {
			salary = (40*wages) + ((wages*1.5)*(hours-40));
		} else if (hours <= 40) {
			salary = wages*hours;
		}
		
		return salary;
	}
	
	public String toString() {
		return super.toString() + "\nEmployee salary: RM" + salary + "\n";
	}
}
