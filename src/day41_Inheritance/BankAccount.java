package day41_Inheritance;

public class BankAccount {
     /*
    WarmUp_Collection tasks:
    create costum class called BankAccount for Bank of America' bank accounts:
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and fullName
                    (DO NOT USE SHORTCUT)
            action:
                    depositing
                    withdrawing
                    availablebalance
                    toString: returns the full name and balance

     */

     public static String bankName = "Bank of America";
     public String firstName;
     public String lastName;

     private String accountHolder;
     private long accountNumber;
     private double balance;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName+" "+lastName;
    }

    public String getAccountHolder() { // baska yerden okuyabilmek icin we need getter
        return accountHolder;
    }

    public void setAccountHolder(String firstName, String lastName) { // create yaptik ama basta constructor icinde initialize
        this.accountHolder = firstName+" "+lastName;         // yaptigimiz icin ihtiyac yok buna
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void depositing(int amount){
       // balance +=amount;  // iki sekilde de yazilabilir
        setBalance(balance + amount);
    }

    public void withdrawing(int amount ){
      // balance -= amount;
       setBalance(balance-amount);

    }

    public void availablebalance(){
        //System.out.println("Available balance: "+balance); // iki sekildede yapilabilir
        System.out.println("Available balance: "+getBalance());
    }

    @Override
    public String toString() {

        return "Full name: "+getAccountHolder()+", Balance: "+getBalance();
//        return "BankAccount{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", accountHolder='" + accountHolder + '\'' +
//                ", accountNumber=" + accountNumber +
//                ", balance=" + balance +
//                '}';
    }
}
