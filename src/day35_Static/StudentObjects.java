package day35_Static;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.name ="muhtar";

        System.out.println(student1);

        Student.printSchoolName(); // static method old icin class name ile cagiralabilir

        Student student2=new Student();
        student2.name ="kuzzat";


        Student student3=new Student();//Name: null school name is: Cybertek name initialize yapmasak
                       // bile okul ismini verir cunku static



    }
}
