package labAss12_Q3;

public class Support extends Staff {
    private double overtime;

    public Support(String name, int age, String phone, int staffID, 
                    double salary, boolean canPromote, double overtime){
            super(name, age, phone, staffID, salary, canPromote);
            this.overtime = overtime;
    }

    public Support(){
        overtime = 0.0;
    }

    public double getOvertime(){
        return overtime;
    }

    public String toString() {
        return super.toString() + 
                "\nOvertime hours: " + overtime; 
    }


}
