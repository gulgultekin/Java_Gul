package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("NewYork","Bank Of America",120000,false);
        Offer offer2 = new Offer();
        offer2.setOfferInfo("MD","Chase",95000,true);
        Offer offer3 = new Offer();
        offer3.setOfferInfo("BayArea","Google",115_000,false);
        Offer offer4 = new Offer();
        offer4.setOfferInfo("VA","CapitalOne",100000,true);

        Offer[]offers ={offer1,offer2,offer3,offer4};

        String myLocation ="VA";

        ArrayList<Offer>Accept = new ArrayList<>(Arrays.asList(offers));

        Accept.removeIf(p->p.salary < 100000 || !p.isFullTime || !p.location.equals("VA") ); // 100K altini or part time remove
                                                                 //or VA olmayanlari remove

        System.out.println(Accept.size());

        for(Offer each: Accept){
            System.out.println(each);
        }






    }
}
