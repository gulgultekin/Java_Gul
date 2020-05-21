package day25_MethodsRecap;

public class WarmUp_Frequency {
  /*  2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
    Ex:
    Frequency("AAABB", "A");  ==> 3
    Frequency("ABAB", "B"); ==> 2
    Frequency("ABABAxcAB", "AB"); ==> 3
    */


    public static void main(String[] args) {

        String str1 = "javajavajavajava";// "AAAAA"
        String str2 = "java"; //"A"   bunu da uygulaybiliriz

        int count =0;

       while (str1.contains(str2)){ // if statement gibi yazip if yerine while yazinca loop oldu
            count++;
           str1 = str1.replaceFirst(str2,""); // we need to make sure that we are not counting the same index over again
        }

        System.out.println(count); //4


       String a = "python python python"; //"ABABCA"
       String b = "python";              //"AB"

       int result = frequency(a,b); //3

       System.out.println(result);



    }


    public static int frequency(String str1, String str2){
        int count =0;

        while (str1.contains(str2)){ // if statement gibi yazip if yerine while yazinca loop oldu
            count++;
            str1 = str1.replaceFirst(str2,""); // we need to make sure that we are not counting the same index over again
        }

        return count;


    }

}
