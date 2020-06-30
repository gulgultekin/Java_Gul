package day54_Maps;

import java.time.LocalDate;

import java.util.LinkedHashMap;


public class Maps_Practice1 {

    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> classMates  =new LinkedHashMap<>();

        classMates.put("Zeynep",LocalDate.of(1980,07,12));//bunu duplicate old icin almadi
        classMates.put("Gul",LocalDate.of(1973,11,18));
        classMates.put("Ayse",LocalDate.of(1973,11,18));//key->farkli, value olanlar ayni olsada aliyor
        classMates.put("Nedime",LocalDate.of(1977,11,06));
        classMates.put("Beyza",LocalDate.of(1998,9,12));
        classMates.put("Zeynep",LocalDate.of(1980,07,13)); // duplicate olanin sonuncusunu aldi

        System.out.println(classMates); //{Zeynep=1980-07-13, Gul=1973-11-18, Ayse=1973-11-18, Nedime=1977-11-06, Beyza=1998-09-12}


        classMates.put("Yusuf",LocalDate.now());
        System.out.println(classMates); //{Zeynep=1980-07-13, Gul=1973-11-18, Ayse=1973-11-18, Nedime=1977-11-06, Beyza=1998-09-12, Yusuf=2020-06-29}

        classMates.remove("Beyza");//Beyzayi cikardi
        System.out.println(classMates);//{Zeynep=1980-07-13, Gul=1973-11-18, Ayse=1973-11-18, Nedime=1977-11-06, Yusuf=2020-06-29}

        System.out.println(classMates.get("Gul"));//1973-11-18

        boolean r1 = classMates.containsValue("muhtar");
        System.out.println(r1);//false

        boolean r2 = classMates.containsValue(LocalDate.of(1980,07,13));
        System.out.println(r2); //true

        classMates.clear();//butun hepsini delete yapacak
        System.out.println(classMates.size());//0


    }
}
