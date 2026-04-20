package labAss12_Q3;

public class testFaculty {
    public static void main(String[] args){
    	//different type of staff object
        Academic acStaff_1 = new Academic("umar", 67, "0129873478", 3924, 6700, false, "Deans office");
        Support supStaff_1 = new Support("irfan", 36, "0122736636", 2736, 3500, false, 15);
        //different type of student object
        Undergraduate ug_1 = new Undergraduate("iman", 22, "0122042406", 1234, "degree", 17, "freshman");
        Postgraduate pg_1 = new Postgraduate("syasya", 30, "0122876406", 1274, "masters", 15, "Effects of narcotics");
        
        // get promotion
        acStaff_1.promotion();
        supStaff_1.promotion();

        // calculate fees
        ug_1.calfees();
        pg_1.calfees();

        //object array
        Staff[] staffList = {acStaff_1, supStaff_1};
        Student[] studentList = {ug_1, pg_1};

        // display
        System.out.println("STAFF DETAILS");
        for(int i = 0; i < staffList.length; i++){
            System.out.print(staffList[i]);
            System.out.println("\n");
        }

        System.out.println("STUDENT DETAILS");
        for(int j = 0; j < studentList.length; j++){
            System.out.print(studentList[j]);
            System.out.println("\n");
        }

    }
}