package day37_Constructors;

public class StudentsObject {

    public static void main(String[] args) {

        Student student1 = new Student("Marina", 34, 'F', "Cybertek");

        // student1.setInfo("Marina", 34, 'F', "Cybertek"); setinfo icinde yazdiklarimizi constructor icinde yazabiliriz

        System.out.println(student1);

        Student student2 = new Student("Gul", 46, 'F', "Cybertek");

        System.out.println(student2);

    }
}
