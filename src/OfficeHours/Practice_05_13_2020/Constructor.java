package OfficeHours.Practice_05_13_2020;

public class Constructor {

    public Constructor(){
        System.out.println("default constructor");//eger obje yoksa print yapmaz
    }

    public static void main(String[] args) {

        //every class must have constructor
        //even we didn't create one, compiler create 1 default constructor
        // execution constructor always depends on the object

       Constructor obj =new Constructor();//default

    }

}

class Employee{

    String name;
    long id;
    double salary;

    public Employee(String name,long id, double salary){
        this.name =name;
        this.id =id;
        this.salary =salary;
    }

    public String toString(){
        return "Name: "+name+", id: "+id+", salary: "+salary;
    }

}

class EmployeeObject{
    public static void main(String[] args) {

    Employee employee1 = new Employee("Gul",123,100000);
        Employee employee2 = new Employee("Reem",456,120000);

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
