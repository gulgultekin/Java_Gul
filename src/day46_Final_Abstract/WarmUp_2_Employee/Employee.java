package day46_Final_Abstract.WarmUp_2_Employee;

public abstract class Employee {
    /*
    Task02:
		1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
		2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes

     */

    String name;
    int age;
    char gender;
    double salary;
    String jobTitle;

    abstract void work();

    public String toString(){
        return "Name: "+name+" Gender: "+gender+" Age: "+age+" Salary: "+salary+" Job Title: "+jobTitle;
    }



}
