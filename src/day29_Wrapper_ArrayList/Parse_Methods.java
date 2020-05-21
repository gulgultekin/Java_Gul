package day29_Wrapper_ArrayList;

public class Parse_Methods {
    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str); //123

        System.out.println(str+1); //1231  // number mi string mi old anlamak icin yanina +1 ekliyoruz
        System.out.println(a1+1); // 124

       byte b1 = Byte.parseByte(str); //---> no boxing primitive to primitive

        System.out.println(b1+1); // number mi string mi old anlamak icin yanina +1 ekliyoruz


        // Integer I1 = Byte.parseByte(str); bu sekilde hata verir. ama casting ile kabul eder

        Integer I1 = (int) Byte.parseByte(str); // int e cast yapinca oluyor  --> Auto-boxing --> primitive to Wrapper class
           // Integer = (int) byte;
          // Integer = int; --> AutoBoxing


        String str2 = "10.5";
        float f1 = Float.parseFloat(str2); // float 10.5

        System.out.println(str2);//10.5   str2+1--> 10.51 string
        System.out.println(f1);  //10.5   f1+1--> 11.5  primitive

        double d1 = Double.parseDouble(str2); // double 10.5


        String str3 = "3147483647";// 2147483647 largest int primitive

        long num1 = Long.parseLong(str3);  // autoboxing
        System.out.println(num1);  //3147483647--> number - long primitive

        String result1 = "true";
        boolean a = Boolean.parseBoolean(result1);   // autoboxing
        System.out.println(a);  // true
        System.out.println( !a );  // false -->!a dersek false verir cunku boolean not string

        String res1 = "Today is monday"; // bu dogru olsa bile boolean exp. icin yanlis old default value verir yani false
        boolean r1 = Boolean.parseBoolean(res1); // true yada false olamsi lazim
        System.out.println(r1); // false cunku boolean default false



        String res2 = "TrUE";// true --> ignore case sensitivity old icin true
        boolean r2 = Boolean.parseBoolean(res2);
        System.out.println(r2);







    }
}
