package labAss12_Q3;

public class Staff extends Person {
    private int staffID;
    private double salary;
    private boolean canPromote = false;
    private String promotion;

    public Staff(String name, int age, String phone, int staffID, double salary, boolean canPromote){
        super(name, age, phone);
        this.staffID = staffID;
        this.salary = salary;
        this.canPromote = canPromote;
    }

    public Staff(){
        staffID = 0;
        salary = 0.0;
        canPromote = false;
    }

    public int getStaffID(){
        return staffID;
    }

    public double getSalary(){
        return salary;
    }

    public boolean getCanPromote(){
        return canPromote;
    }

    public boolean promotion(){
        if (getAge() >= 45){
            canPromote = true;
        } else canPromote = false;

        return canPromote;
    }

    public String getEligibility(){
        if(canPromote = false){
            promotion = "uneligible for promotion :(";
        } else if (canPromote = true) {
            promotion = "eligible for promotion !";
        }

        return promotion;
    }

    public String toString(){
        return super.toString() + 
                "\nStaff ID: " + staffID + 
                "\nSalary: RM" + salary + "\n" +
                getEligibility();
    }
}

