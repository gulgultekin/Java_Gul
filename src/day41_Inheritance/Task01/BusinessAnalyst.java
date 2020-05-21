package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee {
    /*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst

     		name(Inherited)
			salary (Inherited)
			id (Inherited)
			jobTitle (Inherited)
			gender(Inherited)

			writingRequirements()
			gathering()
			toString()(Inherited)
     */

    public void writingRequiremnts(){
        System.out.println(name+" is writing requirements");
    }

    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }

    public BusinessAnalyst (String name,long id,char gender,double salary){
        this.name=name;
        this.id=id;
        this.jobTitle ="Business Analyst";
        this.gender =gender;
        this.salary = salary;
    }


}
