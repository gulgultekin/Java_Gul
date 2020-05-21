package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    /*
    create a class called MyOffers
	Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K
     */
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("NewYork","Bank Of America",120000,true);
        Offer offer2 = new Offer();
        offer2.setOfferInfo("Tampa","Publix",100000,true);
        Offer offer3 = new Offer();
        offer3.setOfferInfo("Miami","Cruise",70000,false);
        Offer offer4 = new Offer();
        offer4.setOfferInfo("California","Amazon",150000,true);
        Offer offer5 = new Offer();
        offer5.setOfferInfo("Orlando","Disney",80000,false);

        Offer[]offers={offer1,offer2,offer3,offer4,offer5};

        for(Offer each:offers){
            System.out.println(each);
        }

        System.out.println("\n*************OFFERACCEPT********************\n");

        ArrayList<Offer>Accept = new ArrayList<>(Arrays.asList(offers));
        Accept.removeIf(p->p.isFullTime == false );
        Accept.removeIf(p->!p.location.equals("Tampa"));
        Accept.removeIf(p->p.salary <100000);


        System.out.println(Accept.size());
        for(Offer each: Accept){
            System.out.println(each);
        }



    }
}
