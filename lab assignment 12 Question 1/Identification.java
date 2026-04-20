package labAss12_Q1;

public class Identification {

	private String name; 
	private String email;
	private char gender;
	
	public Identification(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	
	// setter email
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter
	public String getname() {
		return name; 
	}
	
	public String getemail() {
		return email; 
	}
	
	public char getgender() {
		return gender; 
	}
	
	public String toString() {
		return name + "(" + gender + ") at " + email;
	}
	
}
