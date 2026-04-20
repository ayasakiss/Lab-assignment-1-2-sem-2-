package labAss12_Q3;

public class Undergraduate extends Student {
    private String classification;

    public Undergraduate(String name, int age, String phone, int matricnum, String degreeType,
                     int credHours, String classification){
                    super(name, age, phone, matricnum, degreeType, credHours);
        this.classification = classification;
    }

    public String getClassification(){
        return classification;
    }

    public String toString(){
        return super.toString() + 
                "\nStudent classification: " + classification;
    }
}