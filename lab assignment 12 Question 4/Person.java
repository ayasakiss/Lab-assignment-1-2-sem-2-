package labAss12_Q4;

public class Person {

    private String name;
    private String address;
    private String email;
    private String phone;

    public Person(String name, String address, String email, String phone){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;

    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }
    
    public String toString() {
    	return "Name: " + name + 
    			"\nEmail: " + email;
    }
}

