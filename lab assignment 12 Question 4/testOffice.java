package labAss12_Q4;

public class testOffice {
	public static void main(String[] args) {
		//manager object
		Manager manager = new Manager(
			"Siti Sarah", 
			"1 Jalan Cempaka",
			"sarah@gmail.com",
			"0123456723", 
			3476,
			3500.00,
			1200.00);
		//salesperon object
		Salesperson salesperson = new Salesperson(
			"nur aira",
			"7 Jalan Setia",
			"aira@gmail.com",
			"0172042406",
			2376,
			2300.50,
			560.70);
		
		//print details
		System.out.println(manager);
		System.out.println();
		System.out.println(salesperson);
				
				
				
	}

}
