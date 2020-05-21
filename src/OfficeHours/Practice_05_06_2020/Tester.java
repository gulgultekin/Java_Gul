package OfficeHours.Practice_05_06_2020;

public class Tester {
/*
 create a class called Tester
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
 */
    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name,String jobTitle,double salary,long employeeID){
       this.name =name; // user given argumentName is assigned to instance variable name
        this.employeeID = employeeID; // this yazmayinca local value (yani hicbirsey yazmiyorsa)null veya 0 yaziyor
        this.jobTitle = jobTitle;  // this yazmayinca compiler local variable i tercih ediyor
        this.salary = salary;  // int name=100; gibi bir variable varsa 100 yazacak name yerine

    }

    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle+", salary: $"+salary+", employee ID: "+employeeID;
    }


    public void smokeTesting(){
       int name=100;

        System.out.println(this.name+" is doing Smoke Testing");// burada this yazmazsak 100  doing Smoke Testing cikar
        //local variable old icin compiler onu tercih ediyor
    }

    public void creatingTicket(){

        System.out.println(name+" is creating ticket on Jira");
    }



}
