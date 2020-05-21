package OfficeHours.Practice_05_06_2020;

public class Developer {
/*
create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
 */

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name,String jobTitle,double salary,long employeeID){
        this.name =name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;

    }

    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle+", salary: "+salary+", employee ID: "+employeeID;
    }


    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void fixingBugs(){
        System.out.println(name+" is fixing bug");
    }

}
