package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Madina", 1116179565, "QA", 100000);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Venera",1234223345,"Senior SDET",120000);


        Tester tester3 = new Tester();
        tester3.setTesterInfo("Gul",1333454525,"SDET",110000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Zeynep",11154525,"Manual Tester",110000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("John",222525,"Uber Driver",60000);


        ArrayList<Tester> testers=new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));


       testers.removeIf(p->!p.jobTitle.contains("SDET"));// SDET olmayanlari remove

        double totalBudget = 0;

       for(Tester each: testers){
           System.out.println(each);
           totalBudget+=each.salary;
       }

        System.out.println(totalBudget);



       tester2.smokeTesting();
       tester1.creatingTicket();






    }
}
