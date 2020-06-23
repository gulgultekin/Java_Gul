package day41_Inheritance.Task01;

public class Employee {
    /*
    creata  class called WarmUp_2_Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
	create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
     */

    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+id+", Salary: $"+salary+", Gender: "+gender;
    }


}
