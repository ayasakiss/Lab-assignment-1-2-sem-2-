package labAss12_Q3;

public class Academic extends Staff {
    private String department;
    
    public Academic(String name, int age, String phone, int staffID, 
                    double salary, boolean canPromote, String department) {
        super(name, age, phone, staffID, salary, canPromote);
        this.department = department;
    }
    
    public Academic(){
        department = null;
    }

	public String getDepartment(){
        return department;
    }

    public String toString() {
        return super.toString() + 
                "\nStaff department: " + department; 
    }
}

