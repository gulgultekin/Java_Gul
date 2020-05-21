package OfficeHours.Practice_4_1_2020;

public class StringMethods {
    public static void main(String[] args) {

        String str1="Java";
              //     0123

       char ch1 = str1.charAt(3); //a
        System.out.println(ch1);

        //char ch2 =str1.charAt(4);// 4. index olmadigindan String index out of range: 4 mesaji cikar
        //System.out.println(ch2);

        String str2="Cybertek School";
        int total=str2.length();
        System.out.println(total); //15

        //max index number length-1
        int maxIndex=str2.length()-1;
        System.out.println(maxIndex); //14

        char ch3= str2.charAt(maxIndex); //l
        System.out.println(ch3);

        System.out.println("*********************************");

        String str3= "Cybertek";
            str3 =str3.concat(" School"); //Cybertek School
        System.out.println(str3);

        String str4="Java";
        str4=str4.concat(" is fun"); //Java is fun
        System.out.println(str4);

        System.out.println("*********************************");

        String str5= "CYBERTEK SCHOOL";
        str5=str5.toLowerCase(); //cybertek school
        System.out.println(str5);

        String str6 ="muhtar";
        str6=str6.toUpperCase();//MUHTAR
        System.out.println(str6);


        String str7 ="     gul        ";

        int length=str7.length();// 16 trimden once
        System.out.println(length);

        str7=str7.trim();
        System.out.println(str7);

        int length2=str7.length();// 3 trimden sonra
        System.out.println(length2);

        String str8="  ";

        str8=str8.trim();
        System.out.println(str8.length());//0

        System.out.println("********************************************");


        String st="I like Java";
        //         012345678910
        String word1=st.substring(7,st.length());//if you wanna inc to last index just call length method

        System.out.println(word1);//Java

        String word2 = st.substring(2,6);//like
        System.out.println(word2);

        //"likeJava"

        String word3= st.substring(2,6)+st.substring(7,st.length());
        System.out.println(word3);


        String st2="I like to learn Java";
        //          012345678910
        String word4= st2.substring(10);// learn Java
        System.out.println(word4);

        String r2="Java"; //JaVa
        String r3=r2.substring(0,2);//Ja

        String r4=r2.substring(2,3).toUpperCase()+r2.substring(3);//Va
                //              V                             a
        System.out.println(r3+r4);

        System.out.println("*********************************");

        String str ="I like C#, C# is cool";
        str=str.replace("C#","Java");//I like Java, Java is cool
        System.out.println(str);

        String t1="Java is fun, Java is good";
        t1=t1.replaceFirst("Java","C#");//C# is fun, Java is good
        System.out.println(t1);

        String t2="Java is fun, Java is good";
        t2=t2.replaceFirst(", Java",", C#");//Java is fun, C# is good
        System.out.println(t2);

        System.out.println("******************************************");

        String y1="Today W is Wednesday";
        int numb=y1.indexOf("W");//6
        int numb2=y1.indexOf("Wed");//11
        System.out.println(numb);
        System.out.println(numb2);

        String y2= "Cybertek School, School";
        int a3= y2.indexOf("S");
        System.out.println(a3);//9 first S

        int a4= y2.lastIndexOf("S");
        System.out.println(a4);//17 last S




    }
}
