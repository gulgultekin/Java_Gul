package day39_AccessModifiers;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee emp1= new Employee("Muhtar");
        System.out.println(emp1);

        Employee emp2= new Employee("Zeynep","Sdet");
        System.out.println(emp2);


        Employee emp3= new Employee("Ayse","Sdet",123);
        System.out.println(emp3);


        Employee emp4= new Employee("Gul","Sdet",123,120000);
        System.out.println(emp4);


        Employee emp5= new Employee("Yusuf","Sdet",123,120000,'M');
        System.out.println(emp5);


    }


}
