package day35_Static;

public class Student {  //for cybertek school
    /*
    Attribute: name, id, gpa
    SchoolName ="Cybertek"

    actions ; setInfo()  printschoolname, tostring
     */

    String name;
    int id;
    double gpa;

    static String school ="Cybertek"; // static variable oldugu icin method should be static


    public  void setInfo(String name,int id,double gpa){ //static yazamayiz cunku instanse variab. yazdigimiz icin
                                       // method should NOT static
        this.name = name;
        this.id =id;
        this.gpa = gpa;

    }

    public static void printSchoolName() {// static variable oldugu icin method should be static

        System.out.println("School name is: "+school);
    }

    public String toString(){ //instance var. kullandigimiz icin i can not make static method
        return "Name: "+name+" school name is: "+school;// school static ama ins methodun icinde kullanilabilir

    }


}
