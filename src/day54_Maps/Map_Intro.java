package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
public class Map_Intro {

    public static void main(String[] args) {

        Map<String,Double> employeeInfo = new LinkedHashMap<>();

        employeeInfo.put("Zarina",110000.0);
           // put doesn't do autoboxing, o yuzden int verince hata veriyor, double olmali

        System.out.println(employeeInfo); //{Zarina=110000.0}
        System.out.println(employeeInfo.size()); //1 --> because we only put 1 pair of info

       //ikinciyi ekledik
        employeeInfo.put("Gul",120000.50);
                      //Key       value
        System.out.println(employeeInfo); //{Zarina=110000.0, Gul=120000.5}
        System.out.println(employeeInfo.size()); //2


        System.out.println(employeeInfo.get(0)); //null--> map doesnot have index number

        System.out.println(employeeInfo.get("Zarina")); //110000.0

        System.out.println(employeeInfo.get("Gul")); //120000.5


        employeeInfo.remove("Zarina"); //zarinayi remove yapti

        System.out.println(employeeInfo); //{Gul=120000.5}
        System.out.println(employeeInfo.size()); //1


        System.out.println("***********************************");

   // 2 beyza ekledik
        employeeInfo.put("Beyza",110000.50);
        employeeInfo.put("Beyza",150000.0);

        System.out.println(employeeInfo); //{Gul=120000.5, Beyza=150000.0} //duplicate kabul etmiyor, son yazilani  aldi

    }
}
