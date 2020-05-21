package day42_Inheritance.task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
    create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
     */
    public static void main(String[] args) {
    // school has a student -->has a relationship

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Gul",46,'F',12345,"Java");
        student2.setStudentInfo("Beyza",21,'F',4567,"Science");
        student3.setStudentInfo("Yusuf",18,'M',3475,"Economics");

        ArrayList<Student>list = new ArrayList<>();
        list.addAll(Arrays.asList(student1,student2,student3));

        for(Student each: list){
            //System.out.println(each);
            System.out.println("Name: "+each.name+" ID: "+each.studentID);
        }

    }
}
