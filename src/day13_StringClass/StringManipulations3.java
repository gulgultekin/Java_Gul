package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str="I like Java Programming John";// sadece ilk matching string or characterin index numberini veriyor
         int num =str.indexOf("Jo");//24

         System.out.println(num);

         String str2="Cybertek school is awesome";

         int firstS=str2.indexOf("s");//9
        int a=str2.indexOf("is")+1;//17  yada "s "yazabiliriz
        // is deki 's'in index num icin ("is")+1 diyoruz
        System.out.println(firstS);
        System.out.println(a);


        String names="Muhtar";
        int a1= names.indexOf("G");
        System.out.println(a1);//-1 cunku muhtar doesn't contain "G"

        String fullname="Kuzzat Altay";
        String firstName=fullname.substring(0,fullname.indexOf(" "));
        String lastName= fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstName);
        System.out.println(lastName);



    }
}
