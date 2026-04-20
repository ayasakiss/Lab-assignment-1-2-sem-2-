package labAss12_Q4;

public class Dependant extends Person {
	private char gender;
	private String dob;
	
	public Dependant(String name, String address, String email,String phone, char gender, String dob) {
		super(name, address, email, phone);
		this.gender = gender;
		this.dob = dob;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getDob() {
		return dob;
	}
	
	public String toString() {
		return super.toString() + 
				"\nGender: " + gender + 
				"\nDate of birth: " + dob;
	}
	
	
}