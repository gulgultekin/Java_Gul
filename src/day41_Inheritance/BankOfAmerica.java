package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount person1 = new BankAccount("Gul","Gultekin");

        person1.depositing(100);
        System.out.println(person1.getBalance());

        person1.availablebalance();

        person1.withdrawing(20);
        System.out.println( person1.getAccountHolder());
        System.out.println(person1);

        person1.withdrawing(30);
        person1.availablebalance();



    }
}
