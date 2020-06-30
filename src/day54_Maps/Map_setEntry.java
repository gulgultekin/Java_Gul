package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {

    public static void main(String[] args) {

        LinkedHashMap<String,String> countries = new LinkedHashMap<>();

        countries.put("Turkey","Ankara");
        countries.put("Tajikistan","Dushanbe");
        countries.put("USA","Washington DC");
        countries.put("East Turkistan","Urumqi");
        countries.put("Pakistan","Islamabad");

        for( Map.Entry<String,String>  each : countries.entrySet() ){

            System.out.println( each.getKey() + "'s capital is "+ each.getValue());
            //System.out.println("Capital city of " + each.getKey() + " is : " + each.getValue() );

        }


        String input = "tajikistan";
        for( Map.Entry<String,String>  each : countries.entrySet() ){

            String countryname = each.getKey();
            String cityName = each.getValue();

            if(input.equalsIgnoreCase(countryname)){
                System.out.println(cityName); //Dushanbe
            }
        }

    }
}
