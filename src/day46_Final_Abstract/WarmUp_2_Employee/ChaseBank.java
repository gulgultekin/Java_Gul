package day46_Final_Abstract.WarmUp_2_Employee;

public class ChaseBank {

    public static void main(String[] args) {


        Tester tester1 = new Tester("Gul",46,'F',90000,"SDET");
        System.out.println(tester1);
        tester1.work();

        Developer dev1 =new Developer("Sener",49,'M',100000,"Developer");
        System.out.println(dev1);
        dev1.work();
    }
}
