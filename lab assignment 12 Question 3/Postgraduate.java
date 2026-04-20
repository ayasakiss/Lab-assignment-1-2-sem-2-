package labAss12_Q3;

public class Postgraduate extends Student {
    private String researchTitle;

    public Postgraduate(String name, int age, String phone, int matricnum, String degreeType,
                     int credHours, String researchTitle){
        super(name, age, phone, matricnum, degreeType, credHours);
        this.researchTitle = researchTitle;
     }

    public String getResearchTitle(){
        return researchTitle;
    }

    public String toString(){
        return super.toString() + 
                "\nResearch title: " + researchTitle;
    }
}

