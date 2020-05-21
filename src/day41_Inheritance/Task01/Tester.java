package day41_Inheritance.Task01;

public class Tester extends Employee {
    /*
    create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester

			name(Inherited)
			salary (Inherited)
			id (Inherited)
			jobTitle (Inherited)
			gender(Inherited)

			reporting()
			testing()
			toString()(Inherited)
     */


    public void reportingBug(){
        System.out.println(name+" is reporting bug");
    }

    public void testing(){
        System.out.println(name+" testing");
    }

    public Tester (String name,long id,String jobTitle,char gender,double salary){
        this.name=name;
        this.id=id;
        this.jobTitle =jobTitle;
        this.gender =gender;
        this.salary = salary;
    }

}
