package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets ={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35,45,35,false);


        System.out.println(carpets[0]);
        System.out.println("\n**********2.Carpet**********");
        System.out.println(carpets[1]);
        System.out.println("\n**********3.Carpet**********");
        System.out.println(carpets[2]);
        System.out.println("\n**********4.Carpet**********");
        System.out.println(carpets[3]);
        System.out.println("\n**********5.Carpet**********");
        System.out.println(carpets[4]);


        System.out.println("\n**********Persian Carpets**********");

        ArrayList<Carpet>persianCarpets = new ArrayList<>();

        for(Carpet each:carpets){
            if(each.isPersian){
                persianCarpets.add(each);
            }
        }
        System.out.println("There are "+persianCarpets.size()+" Persian carpets"); // kac tane persian carpet old veriyor


        System.out.println("$"+persianCarpets.get(0).calcCost());//1. halinin total price

        System.out.println("$"+persianCarpets.get(1).calcCost()); //2. halinin total price



        System.out.println("\n**********Regular Carpets**********");

        ArrayList<Carpet>regularCarpets = new ArrayList<>(Arrays.asList(carpets));

        //regularCarpets.removeAll(persianCarpets);

        regularCarpets.removeIf(p->p.isPersian); //yukaridakiyle ayni sadece predicate ile

        System.out.println("There are "+regularCarpets.size()+" regular carpets");

        for(int i=0; i< regularCarpets.size();i++) {
            System.out.println("$" + regularCarpets.get(i).calcCost());

        }



    }

}
