package labAss12_Q2;

public class Commision extends Employee {
	
	private double grossSales;
	private double rate;
	private double salary;
	
	public Commision(Name name, String address, int staffNum, double grossSales, double rate) {
		super(name, address, staffNum);
		this.grossSales = grossSales;
		this.rate = rate;
				
	}
	public double getGrossSale() {
		return grossSales;
	}
	
	public double getRate() {
		return rate;
	}
	
	//override
	public double calcSalary() {
		salary = grossSales*rate;
		return salary;
	}
	
	public String toString() {
		return super.toString() + "\nEmployee salary: RM" + salary + "\n";
	}

}
