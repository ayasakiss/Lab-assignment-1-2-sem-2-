package labAss12_Q2;

public class testSalary {
	public static void main(String[] args) {
		
		
		Name name1 = new Name("alysa", "dania");
		Name name2 = new Name("aira", "riana");
		Name name3 = new Name("Siti", "Sara");
		
		Commision commStaff = new Commision(name1, "2 Jalan Damai", 3456, 560, 7.7);
		commStaff.calcSalary();
		
		Hourly hourlyStaff_1 = new Hourly(name2, "3 Jalan Melur", 8769, 10, 50);
		hourlyStaff_1.calcSalary();
		
		Hourly hourlyStaff_2 = new Hourly(name3, "1 Jalan Cempaka", 2938, 10, 37);
		hourlyStaff_2.calcSalary();
		
		
		//display employee salary details
		System.out.println("----COMMISION EMPLOYEE----");
		System.out.println(commStaff);
		
		System.out.println("----HOURLY EMPLOYEE----");
		System.out.println(hourlyStaff_1);
		System.out.println(hourlyStaff_2);
		
	}
}
