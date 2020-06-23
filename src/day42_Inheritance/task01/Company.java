package day42_Inheritance.task01;

public class Company {
    /*
    create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */

    public static Employee emp1;
    public static Employee emp2;
    public static Employee emp3;
    static{
        emp1 = new Employee();
        emp1.setEmployeeInfo("Sener",49,'M',100000,12300,"developer");

        emp2 = new Employee();
        emp2.setEmployeeInfo("Gul",46,'F',90000,30077,"Sdet");

        emp3 = new Employee();
        emp3.setEmployeeInfo("Beyza",21,'F',110000,45001,"developer");
    }

    public static void main(String[] args) {
     // company has a employee --> has a relationship

//        WarmUp_2_Employee emp1 = new WarmUp_2_Employee();
//        WarmUp_2_Employee emp2 = new WarmUp_2_Employee();
//        WarmUp_2_Employee emp3 = new WarmUp_2_Employee();
//
//        emp1.setEmployeeInfo("Sener",49,'M',100000,12300,"developer");
//        emp2.setEmployeeInfo("Gul",46,'F',90000,30077,"Sdet");
//        emp3.setEmployeeInfo("Beyza",21,'F',110000,45001,"developer");

        Employee[]employees ={emp1,emp2,emp3};
        for(int i=0; i<employees.length;i++){
           // System.out.println(employees[i]);
            System.out.println("Name: "+employees[i].name+", ID: "+employees[i].employeeID);
        }


    }
}
