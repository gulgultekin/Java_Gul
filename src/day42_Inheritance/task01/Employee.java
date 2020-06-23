package day42_Inheritance.task01;

public class Employee extends Person{
    /*
    create a sub class of person called WarmUp_2_Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
				 /*
     name (inherited)
     age (inherited)
     gender (inherited)
     Salary
     employeeID
     jobTitle

     setPersonInfo() (inherited)
     eat() (inherited)
     sleep() (inherited)
     walk() (inherited)
     drink() (inherited)
    setEmployeeInfo()
    Work()
    toString()
     */
// employee is aperson-->is a relationship
    public double salary;
    public long employeeID;
    public String jobTitle;

    public void work(){
        System.out.println(name+" is working");
    }

    public void setEmployeeInfo(String name,int age,char gender,double salary,long employeeID,String jobTitle){

        setPersonInfo(name,age,gender);
        this.employeeID=employeeID;
        this.jobTitle =jobTitle;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+employeeID+", Salary: "+salary+", age: "+age+", gender: "+gender;
    }


}
