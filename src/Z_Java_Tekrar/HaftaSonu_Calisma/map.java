package Z_Java_Tekrar.HaftaSonu_Calisma;

import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        Map< Integer,String> sinif = new HashMap< Integer,String>();
        sinif.put(1,  "Yusuf");
        sinif.put(2, "Ali");
        sinif.put(3, "Gul");

        for (int i = 1; i < sinif.size()+1 ; i++) {
            System.out.println(i + " nolu ogernci "+ sinif.get(i));

        }


       // System.out.println("1.st entry: acmak anlami " + dictionary.get("acmak")  );

//        for(Map.Entry  each: dictionary.entrySet()) {
//            System.out.println(each.getKey() +" :: "+ each.getValue());
//        }
    }
}
