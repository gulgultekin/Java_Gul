package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {
    public static void main(String[] args) {

       Developer developer1 = new Developer();
       developer1.setInfo("Sener","J.Developer",100000,122345);

        System.out.println(developer1);
        developer1.coding();


       Developer developer2 =new Developer();
       developer2.setInfo("John","S.Developer",110000,12546);

        System.out.println(developer2);
       developer2.fixingBugs();

        System.out.println("\n*********ARRAY***************\n");

        Developer[]arr ={developer1,developer2};

        for(Developer each: arr){
            System.out.println(each.name+" "+each.jobTitle);
        }

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("\n**************ARRAYLIST****************\n");

        ArrayList<Developer>developers = new ArrayList<>();
        developers.addAll(Arrays.asList(developer1,developer2));

        System.out.println(developers.size());

        for(int i=0; i<developers.size();i++){
            System.out.println(developers.get(i).name);
        }

        for(Developer each:developers){
            System.out.println(each.name+"-"+each.salary);
        }

        developers.removeIf(p->p.jobTitle.equals("S.Developer"));
        System.out.println(developers);

    }
}
