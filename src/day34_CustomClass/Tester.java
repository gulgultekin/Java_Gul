package day34_CustomClass;

public class Tester {
    /*
    create a class called Tester
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create thier thier automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Tester in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
     */


    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void smokeTesting(){

        System.out.println(name+" doing Smoke Testing");
    }

    public void creatingTicket(){

        System.out.println(name+" created a ticket");
    }

    public void setTesterInfo(String name,long employeeID,String jobTitle,double salary){
        this.name =name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }
    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle+", employee ID: "+employeeID+", salary: "+salary;
    }



}
