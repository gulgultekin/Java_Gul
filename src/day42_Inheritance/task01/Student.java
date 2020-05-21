package day42_Inheritance.task01;

public class Student extends Person {
    /*
    create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
     */
// student is a person--> is arelationship
    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek University";

    public void attendClass(){
        System.out.println(name+ " is attending "+clazz);
    }

    public void code(){
        System.out.println(name+ " is coding");
    }

    public void setStudentInfo(String name,int age,char gender,long studentID,String clazz){
        setPersonInfo(name,age,gender);
        this.studentID=studentID;
        this.clazz =clazz;
    }

    public String toString(){
        return "Name: "+name+", Student ID: "+studentID+", Age: "+age+", Gender: "+gender+" Class: "+clazz+", School Name: "+schoolName;
    }









}
