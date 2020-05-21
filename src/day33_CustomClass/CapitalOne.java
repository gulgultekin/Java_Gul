package day33_CustomClass;

public class CapitalOne {
    /*
    create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
     */

    public static void main(String[] args) {

        BankAccount Gul = new BankAccount();
        Gul.accountHolder = "Gul";
        Gul.accountNumber =1234567890;

        Gul.checkingBalance();
        Gul.deposit(35);
        Gul.checkingBalance();

        Gul.withDraw(15);
        Gul.checkingBalance();

        Gul.withDraw(45);// penalty ekle
        Gul.checkingBalance();

        Gul.withDraw(100);// you are allow to withdrw yazdir
        System.out.println("\n*******Account info****************\n");
        System.out.println(Gul);


    }
}
