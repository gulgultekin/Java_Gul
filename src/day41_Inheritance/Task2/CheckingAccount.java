package day41_Inheritance.Task2;

public class CheckingAccount extends BankAccount2{
    /*
    create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance

			accountHolder (inherited)
			accountNumber (inherited)
			balance  (inherited)

			deposit (inherited)
			withDraw
			showBalance (inherited)
			toString (inherited)
     */

    public void withDraw(int amount){ // instance variable (balance) kullandigimiz icin method static olamaz
        balance-=amount;
    }

}
