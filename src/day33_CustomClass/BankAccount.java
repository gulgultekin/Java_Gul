package day33_CustomClass;

public class BankAccount {
   /*
      create a custom class for bank account
      attributes--> accountholder,accountnumber,balance
      actions--> checkingBalance(), withDraw( amount ),deposit( amount)

     */

       String accountHolder;
       long accountNumber;
       double balance;
       int count=0;


       public void checkingBalance(){

           System.out.println("Available balance : $"+balance);
       }


       public void withDraw(double amount){

           if(balance<=0){
               System.out.println("there is no available balance");
               return; //exits the method withDraw(
           }

           balance -= amount;
           if(balance<0){
               balance-=35;
           }
           System.out.println("New balance: $"+balance);
//           System.out.println("Withdrawing $"+amount);
//           if (amount > balance) {
//               if (count < 1) {
//                   balance -= 35;
//                   balance -= amount;
//                   count++;
//                   System.out.println("Number of low withdrawal: "+ count);
//               } else {
//                   System.out.println("Number of low withdrawal: "+ count);
//                   System.out.println("You can not withdraw!\n Reason: This your second attempt withdrawing insufficient amount!...");
//               }
//           } else {
//               balance-=amount;
//           }

       }

       public void deposit(double amount){
           System.out.println("Depositing $"+amount);
           balance+=amount;
       }

       public String toString(){
           String result="Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber
                   +"\nAvailable Balance"+balance;
           return result;
       }

}
