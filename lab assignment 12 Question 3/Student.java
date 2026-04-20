package labAss12_Q3;

public class Student extends Person {
    private int matricnum;
    private String degreeType;
    private int credHours;
    private double fees;

    public Student(String name, int age, String phone, int matricnum, String degreeType,
                     int credHours){
        super(name, age, phone);
        this.matricnum = matricnum;
        this.degreeType = degreeType;
        this.credHours = credHours;
    }

    public Student(){
        matricnum = 0;
        degreeType = null;
        credHours = 0;
    }

    public int getMatricnum(){
        return matricnum;
    }

    public String getDegreetype(){
        return degreeType;
    }

    public int credHours(){
        return credHours;
    }

     public double calfees(){

         if (degreeType.equals("degree" ))
             fees = credHours*100;
         if (degreeType.equals("masters" ))
             fees = credHours*200;
         if (degreeType.equals("ph.D" ))
             fees = credHours*300;

         return fees;
     }
     
     public double getFees(){
         return fees;
     }
     
    public String toString(){
        return super.toString() +
                "\nMatric Number: " + matricnum +
                "\nStudent fees: RM" + fees;
    }
}

