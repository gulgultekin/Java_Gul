package day40_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        EmployeeInfo Abdul = new EmployeeInfo();
        Abdul.setAddress("111 main st.");
        Abdul.setID(123);
        Abdul.setSalary(80000);
        Abdul.setSSN(12345);
        System.out.println(Abdul.getAddress());
        System.out.println(Abdul.getID());
        System.out.println(Abdul.getSalary());
        System.out.println(Abdul.getSSN());
        System.out.println(Abdul.companyName);




    }
}
