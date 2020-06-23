package day50_Polymorphism.Task_1_Student;

import java.util.ArrayList;
import java.util.Arrays;

/*
4. create a class named CybertekSchool
            create 5 objects of students and set your classmates' info
            create a list of Cybertek and store all student objects
            iterate the list to display the full information of students
 */
public class CybertekSchool {

    public static void main(String[] args) {

        Student student1 = new Student("Gul", 46, 'B', false);

        Student student2 = new Student("Yusuf", 18, 'A', true);
        Student student3 = new Student("Sam", 27, 'C', false);
        Student student4 = new Student("Beyza", 21, 'A', false);
        Student student5 = new Student("Elif", 25, 'B', true);

//        student1.setStudentName("Gul");
//        student1.setGrade('B');
//        student1.setAge(46);
//        student1.setHas_ITBackGround(false);
//
//        student2.setStudentName("Zeynep");
//        student2.setGrade('B');
//        student2.setAge(36);
//        student2.setHas_ITBackGround(false);
//
//        student3.setStudentName("Beyza");
//        student3.setGrade('A');
//        student3.setAge(21);
//        student3.setHas_ITBackGround(false);
//
//        student4.setStudentName("Yusuf");
//        student4.setGrade('A');
//        student4.setAge(18);
//        student4.setHas_ITBackGround(true);
//
//        student5.setStudentName("Ayse");
//        student5.setGrade('C');
//        student5.setAge(26);
//        student5.setHas_ITBackGround(true);

        ArrayList<Cybertek> allStudents = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));

        for (Cybertek each : allStudents){
        System.out.println(each);
        }





    }


}
