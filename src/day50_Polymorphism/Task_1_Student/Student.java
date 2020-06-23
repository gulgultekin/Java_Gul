package day50_Polymorphism.Task_1_Student;

//3. create an class named Student that can inherit from  onlineEducation and CybertekSchool
//            private variables: studentName, age, grade, has_ITBackGround
//            encapsulate all private variables
//            actions: studying(), takingBreaks(), toString()

public class Student implements onlineEducation, Cybertek{

    private String studentName;
    private int age;
    private char grade;
    private boolean has_ITBackGround;

    public Student(String studentName,int age, char grade, boolean has_ITBackGround){
        // needing this method to create object
        this.studentName=studentName;
        this.age=age;
        this.grade = grade;
        this.has_ITBackGround=has_ITBackGround;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGrade(){
        return grade;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }


    public boolean isHas_ITBackGround() {
        return has_ITBackGround;
    }

    public void setHas_ITBackGround(boolean has_ITBackGround) {
        this.has_ITBackGround = has_ITBackGround;
    }

    public void studying(){
        System.out.println(studentName+" is studying");
    }

    public void takingBreaks(){
        System.out.println(studentName+" is taking break");
    }

    public String toString(){
        return "Student name: "+studentName+", Age: "+age+", Grade: "+grade+", Has_ITBackGround:  "+has_ITBackGround;
    }
    @Override
    public void attendClass() {

    }
}
