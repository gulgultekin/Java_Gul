package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[] DevTeam ={"Zeynep","Gul","Beyza", "Muhtar"};

        String[] TestersTeam = {"Yusuf","Ayse","Fatma","Betul"};

        String[] PO ={"Zura","Donald"};

        String[] TestersTeam2 = {"Zarina","Ayla","Ilham"};


        String[][] ScrumTeam = {DevTeam,TestersTeam,PO};
                  //              0     ,    1

        ScrumTeam[0][3]="Jean";// Muhtarin yerine bunu atiyoruz.

        System.out.println(ScrumTeam[0][3]); //Jean

        String info = ScrumTeam[1][2];

        System.out.println(info); // Fatma

        System.out.println("===============================");

        // DevTeam'i print etmek icin

       for(String eachEmp: ScrumTeam[0]){
           System.out.println(eachEmp);
       }


        // TestersTeam'i print etmek icin

        for(String eachEmp: ScrumTeam[1]){
            System.out.println(eachEmp);
        }

        // po yu print etmek icin

        for(String eachEmp: ScrumTeam[2]){
            System.out.println(eachEmp);
        }
        System.out.println("===============================");

        System.out.println(ScrumTeam[2][1]); // Donald

        TestersTeam =TestersTeam2;
        System.out.println(Arrays.toString(TestersTeam)); //[Zarina, Ayla, Ilham]

        //yada
        ScrumTeam[1]=TestersTeam2;
        System.out.println(Arrays.toString(ScrumTeam[1])); //[Zarina, Ayla, Ilham]

    }
}
