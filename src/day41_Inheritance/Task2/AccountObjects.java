package day41_Inheritance.Task2;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder ="Gul";

        obj.showBalance();
        obj.deposit(100);

        System.out.println(obj);

        obj.withDraw(30);
        obj.showBalance();


        System.out.println("**************************");

        SavingAccount saving = new SavingAccount();
        saving.accountHolder ="Sener";
        saving.deposit(200);
        saving.showBalance();

      //  System.out.println(saving.interestRate);
        System.out.println(SavingAccount.interestRate); // class isminden de cagirilir cunku static

       // saving.withdraw(); withdraw checking accounta ait.
        System.out.println(saving);



    }
}
