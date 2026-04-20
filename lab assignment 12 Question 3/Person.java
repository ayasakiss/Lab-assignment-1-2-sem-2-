package labAss12_Q3;

public class Person {

	    private String name;
	    private int age;
	    private String phone;

	    public Person(String name, int age, String phone){
	        this.name = name;
	        this.age = age;
	        this.phone = phone;
	    }

	    public Person(){
	        name = null;
	        age = 0;
	        phone = null;
	    }

	    public String getName(){
	        return name;
	    }

	    public int getAge(){
	        return age;
	    }

	    public String getPhone(){
	        return phone;
	    }

	    public String toString(){
	        return "Name: " + name +
	                "\nAge: " + age + 
	                "\nPhone: " + phone;
	    }
	
	}

