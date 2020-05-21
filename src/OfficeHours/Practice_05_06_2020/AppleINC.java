package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {
    /*
       /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */


    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,1245);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);
        System.out.println("\n*****************HIRE******************\n");

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arrayList in scrumteam class
        scrum1.hireATester(tester3); // ScrumTeam Arrayliste ekleniyor
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        //scrum1.testersTeam //returns the testersTeam arrayList from scrum1

        for(Tester each: scrum1.testersTeam){ // prints out every single tester from scrumteam
            System.out.println(each); // 3 tester hire yapildi
        }
        System.out.println("\n*************FIRE******************\n");
        scrum1.fireATester(1245);

        for(Tester each: scrum1.testersTeam){
            System.out.println(each);
        }
        System.out.println("\n*************DEVELOPERS******************\n");

        Developer developer1 = new Developer();
        developer1.setInfo("Barzy","Senior Developer",120200,1122337);



        Developer developer2 = new Developer();
        developer2.setInfo("Sener","Developer",150000,12345);

        scrum1.hireADeveloper(developer1);
        scrum1.hireADeveloper(developer2);

        System.out.println(scrum1.developersTeam.size());//2

        for(Developer each: scrum1.developersTeam){ //arraylist of developer in scrum team
            System.out.println(each);
        }

       // scrum1.fireADeveloper(1122337);

        System.out.println(scrum1.developersTeam.size());//1 fire oldu biri


        System.out.println("/n********SCRUM TEAM*********************\n");

        System.out.println("In my Scrum team, We have "+scrum1.testersTeam.size()+" testers and "
                +scrum1.developersTeam.size()+" developers");

        System.out.println("\n**********SCRUM2***************\n");
/*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */
        Tester tester4 = new Tester();
        tester4.setInfo("Gul","SDET",90000,7412);

        Tester tester5 = new Tester();
        tester5.setInfo("Beyza","QA",80000,6512);

        Developer developer3 = new Developer();
        developer3.setInfo("Yusuf","J.Developer",120000,12745);

        Developer developer4 = new Developer();
        developer4.setInfo("Ali","Developer",100000,6662345);

        Developer developer5 = new Developer();
        developer5.setInfo("Veli","Developer",80000,7562345);

        Developer developer6 = new Developer();
        developer6.setInfo("Arzu","Developer",110000,889345);

        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.hireATester(tester4);
        scrum2.hireATester(tester5);
        scrum2.hireADeveloper(developer3);
        scrum2.hireADeveloper(developer4);
        scrum2.hireADeveloper(developer5);
        scrum2.hireADeveloper(developer6);

       for(Tester each: scrum2.testersTeam){
           System.out.println(each);
       }

       for(int i=0; i<scrum2.developersTeam.size();i++){
           System.out.println(scrum2.developersTeam.get(i));
       }

        System.out.println("\n**********SCRUM3***************\n");

        Tester tester6 = new Tester();
        tester6.setInfo("Zeynep","QA",70000,741244);

        Tester tester7 = new Tester();
        tester7.setInfo("Zura","SDET",80000,741211);

        Tester tester8 = new Tester();
        tester8.setInfo("Ayse","QA",90000,741255);

        Developer developer7 = new Developer();
        developer7.setInfo("Can","Developer",110000,1274577);

        Developer developer8 = new Developer();
        developer8.setInfo("Canan","J.Developer",120000,1274599);

        Developer developer9 = new Developer();
        developer9.setInfo("Hasan","Developer",100000,1274512);

        Developer developer10 = new Developer();
        developer10.setInfo("Omer","Developer",130000,1274574);

        Developer developer11 = new Developer();
        developer11.setInfo("Yusufi","Developer",120000,1274596);

        ScrumTeam scrum3 = new ScrumTeam();

        scrum3.hireATester(tester6);
        scrum3.hireATester(tester7);
        scrum3.hireATester(tester8);
        scrum3.hireADeveloper(developer7);
        scrum3.hireADeveloper(developer8);
        scrum3.hireADeveloper(developer9);
        scrum3.hireADeveloper(developer10);
        scrum3.hireADeveloper(developer11);

        for(int i=0; i<scrum3.testersTeam.size();i++){
            System.out.println(scrum3.testersTeam.get(i).name+" "+scrum3.testersTeam.get(i).jobTitle);
        }

        for(Developer each: scrum3.developersTeam){
            System.out.println(each.name+" "+each.jobTitle);
        }

        System.out.println("\n**********ARRAYLIST*******************\n");
        /*
         create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
               NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */

        ArrayList<ScrumTeam>scrumteams = new ArrayList<>(Arrays.asList(scrum1,scrum2,scrum3));



        for(ScrumTeam each : scrumteams){
            if(each.testersTeam.removeIf(p->p.salary<100000));

        }


        for(ScrumTeam each : scrumteams){
            if(each.developersTeam.removeIf(p->p.salary<120000));
        }

        for(int i=0; i<scrumteams.size();i++){
            System.out.println(scrumteams.get(i).testersTeam);
        }
        for(int i=0; i<scrumteams.size();i++){
            System.out.println(scrumteams.get(i).developersTeam);
        }


    }
}
