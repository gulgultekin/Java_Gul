package OfficeHours.Practice_05_13_2020;

public class Student {
    /*
    PersonalInfo:
      name, id
      tostring
     */


     String name; // static olursa butun obj name ayni olur
    long id;
   static String schoolName = "Cybertek";

    public String toString(){ // instance variable kullandigimiz icin method static OLAMAZ
      // String schoolName = "Cybertek";// class member, burada boyle tanimlanabilir
        return "Name: "+name+", id: "+id+", School name: "+schoolName;
    }

    public static void printSchoolName(){
        System.out.println(schoolName+" School");
    }

}

class StudentObject{

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name ="Madina";
        student1.id =123;

        Student student2 = new Student();
        student2.name = "Emrah";
        student2.id =456;

        student1.schoolName= "Harvard";// iksinde de degistirir
        System.out.println(student1);
        System.out.println(student2);




    }


}
