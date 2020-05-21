package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentInfo("Gul","Turkey",46,4.0,'F',true);


        Student student2 = new Student();
        student2.setStudentInfo("Mike","German",30,3.5,'M',false);


        Student student3 = new Student();
        student3.setStudentInfo("James Bond", "English", 40, 3.0, 'M', false);


        Student student4 = new Student();
        student4.setStudentInfo("Johnny Guitar", "US",40,2.4,'M',false );


        Student[] students ={student1,student2,student3,student4};


        System.out.println("\n************canGraduate******************\n");

        ArrayList<Student>canGraduate = new ArrayList<>( Arrays.asList(students) );
        canGraduate.removeIf(p-> p.gpa <= 3.0); // gpa <= 3 den kucukleri remove yap


        System.out.println(canGraduate.size()); // 2 ogrenci graduate yapar

        for(int i=0; i<canGraduate.size();i++){
           Student each = canGraduate.get(i);
            System.out.println(each.name); // sadece graduate yapanlarin isimleri
        }


        System.out.println("\n*****************canNotGraduate**********************\n");

        ArrayList<Student> canNotGraduate = new ArrayList<>(Arrays.asList(students));
       // canNotGraduate.removeAll((canGraduate));

        canNotGraduate.removeIf(p->p.gpa >3.0);
        System.out.println(canNotGraduate.size()); // 2 kisi

        for(Student each:canNotGraduate){
            System.out.println(each.name);
        }























    }

}
