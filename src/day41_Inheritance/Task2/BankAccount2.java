package day41_Inheritance.Task2;

public class BankAccount2 {
    /*
    Task02:
	create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
	create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
	create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
     */

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void deposit(int amount) {
        balance += amount;
    }

    public void showBalance() {
        System.out.println("Available balance: " + balance);
    }

    public String toString() {

        return "Full name: " + accountHolder + ", Balance: " + balance;

    }
}
