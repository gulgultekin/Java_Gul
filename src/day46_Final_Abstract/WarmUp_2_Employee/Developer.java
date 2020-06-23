package day46_Final_Abstract.WarmUp_2_Employee;

public class Developer extends Employee {


    public Developer(String name,int age,char gender,double salary,String jobTitle){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void work(){
        System.out.println(name+" is coding");
    }
}
