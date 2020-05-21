package day41_Inheritance.Task01;

public class Developer extends Employee {
    /*
    create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer

	     name(Inherited)
			salary (Inherited)
			id (Inherited)
			jobTitle (Inherited)
			gender(Inherited)

			fixingBug()
			coding()
			toString()(Inherited)
     */

    public void fixingBug(){
        System.out.println(name+" fixing bug");
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public Developer(String name,long id,String jobTitle,char gender,double salary) {
        this.name=name;
        this.id=id;
        this.jobTitle =jobTitle;
        this.gender =gender;
        this.salary = salary;
    }
}
