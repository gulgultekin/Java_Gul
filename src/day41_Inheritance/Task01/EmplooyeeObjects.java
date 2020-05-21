package day41_Inheritance.Task01;

public class EmplooyeeObjects {
    public static void main(String[] args) {

        Tester tester1= new Tester("Gul",12345,"SDET",'F',100000);
        tester1.reportingBug();
        tester1.testing();
        System.out.println(tester1);

        System.out.println("****************************\n");

        Developer dev1 = new Developer("Sener",19876,"Developer",'M',150000);
        dev1.coding();
        dev1.fixingBug();
        System.out.println(dev1);

        System.out.println("****************************\n");

        BusinessAnalyst bA = new BusinessAnalyst("Yusuf",4563,'M',130000);
        bA.gathering();
        bA.writingRequiremnts();
        System.out.println(bA);

    }
}
