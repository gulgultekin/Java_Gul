package day41_Inheritance.Task2;

public class SavingAccount extends BankAccount2 {
    /*
    create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance

			accountHolder (inherited)
			accountNumber (inherited)
			balance  (inherited)

			interestRate

			deposit  (inherited)
			showBalance  (inherited)
			toString  (inherited)
     */

    public static double interestRate;

    static{
        interestRate = 0.02;
    }






}
