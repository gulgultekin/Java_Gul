package day50_Polymorphism.Task_1_Student;

//2. create an interface named Cybertek that can inherit from OnlineEducation
//            variable: schoolName, requiresITBackGround

public interface Cybertek extends onlineEducation {

    String schoolName = "Cybertek";
    boolean requiresITBackGround = false;

}
