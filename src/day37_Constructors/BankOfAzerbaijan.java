package day37_Constructors;

import java.util.ArrayList;

public class BankOfAzerbaijan {
    /*
    3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
     */

    public static void main(String[] args) {

        ArrayList<Employees> list =new ArrayList<>();

        list.add(HumanResources.emp1);
        list.add(HumanResources.emp3);

        for(Employees each: list){
            System.out.println(each);
        }
        System.out.println("\n******yada *****\n"); //yada
        System.out.println(list.get(0));
        System.out.println(list.get(1));



    }


}
