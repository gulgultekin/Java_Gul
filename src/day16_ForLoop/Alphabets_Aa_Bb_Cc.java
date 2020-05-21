package day16_ForLoop;

public class Alphabets_Aa_Bb_Cc {

    public static void main(String[] args) {
        String upperCase ="";//A~Z
        String lowercase =""; //a~z

        for(char ch='A'; ch<='Z'; ch++){
            upperCase+=ch;
        }
        System.out.println(upperCase);

        for(char ch ='a'; ch<='z'; ch++){
            lowercase+=ch;
        }

        System.out.println(lowercase);

        //Aa Bb Cc Dd.....
        String result ="";
        for(int i=0; i<=upperCase.length()-1; i++){
            result+=upperCase.charAt(i)+""+lowercase.charAt(i)+" ";
        }
        System.out.println(result);

        System.out.println("***********************");


        // second solution
        int a= 97; // ascii table numarasi
        int A= 65;
        String result2="";

        //alphabette 25 harf var
        for(int i =0; i<26; i++){
            char ch =(char) (A +i); // upper case character
                        //   65+0
            char ch2 =(char) (a +i);
                //            97+0
            result2+=ch+""+ch2+" ";

        }

        System.out.println(result2);









    }
}
