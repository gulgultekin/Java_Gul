package day46_Final_Abstract.WarmUp_2_Employee;

public class Tester extends Employee {
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

    public Tester(String name,int age,char gender,double salary,String jobTitle){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    @Override
    void work(){
        System.out.println(name+" is testing");
    }


}
