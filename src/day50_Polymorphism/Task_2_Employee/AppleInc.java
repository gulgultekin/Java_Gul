package day50_Polymorphism.Task_2_Employee;

import java.util.ArrayList;
import java.util.Arrays;

/*
6. create a class named AppleInc:
            create 2 Tester' and 3 Developer' objects
            create a list of ScrumTeam and store all Tester's and Developer's objects
            Iterator the list of scrum team to diplay the informations of the full time employees
 */
public class AppleInc {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Gul", 1254, 90000, 14521, "Tester",true,true);
        Tester tester2 = new Tester("John",65365,80000,35355,"Sdet",true,true);
        Developer developer1 = new Developer("Sener",123,100000,83214,"Dev",true,true);
        Developer developer2 = new Developer("Beyza",883,110000,37214,"Dev",true,true);
        Developer developer3 = new Developer("Yusuf",443,120000,32114,"Dev",true,true);


        ArrayList<ScrumTeam>list = new ArrayList<>(Arrays.asList(tester1, tester2,developer1,developer2,developer3));

        for(ScrumTeam each: list){
            System.out.println(each);
        }






    }
}
