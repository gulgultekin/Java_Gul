package day37_Constructors;

public class HumanResources {
    /*
    2. create a class called HumanResources
			declare 5 variables of Employees as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
     */

    static Employees emp1 =new Employees();
    static Employees emp2 =new Employees();
    static Employees emp3 =new Employees();
    static Employees emp4 =new Employees();
    static Employees emp5 =new Employees();


    static{// bu bilgileri main method icinde yazsaydik. BankOfAzerbaijan dan cagirinca gelmedi. cunku main methodun run olasi lazim.
        // ama static method class load olunca ilk calisan old icin bilgiler gitti
        emp1.setEmployeeInfo("Zuleyha",1254,45874641,"QA",110000,'F');
        emp2.setEmployeeInfo("Zeynep",1542,4877741,"Tester",100000,'F');
        emp3.setEmployeeInfo("Gul",1784,974641,"Developer",130000,'F');
        emp4.setEmployeeInfo("Yusuf",1872,45875641,"QA",110000,'M');
        emp5.setEmployeeInfo("Nedime",1299,4580011,"Tester",120000,'F');
    }

    public static void main(String[] args) {
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
    }

}
