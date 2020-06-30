package day54_Maps;

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {


        String str1 = "Cybertek";//string literal
        str1.concat(" School");

        System.out.println(str1); //Cybertek

   //JUST FOR INTERVIEW
        System.out.println("=================StringBuilder===============================");

        StringBuilder builder = new StringBuilder("Cybertek"); // you will be able to modify string
                builder.append(" School");

                // StringBuilder is  mutable
        System.out.println(builder); // Cybertek School

        System.out.println("*******************StringBuffer******************************");

        StringBuffer buffer = new StringBuffer("Cybertek"); // you will be able to modify string
        buffer.append(" School");

        // StringBuffer is  mutable
        System.out.println(buffer); // Cybertek School

        System.out.println("===============================================");

        String word = "ABCD";//reverse yapmak icin yeni bir obje olusturman lazim


        StringBuilder sb = new StringBuilder(word);//string wordu buraya yazinca reverse ediyor
        sb.reverse();
        System.out.println(sb); //DCBA

        //word =sb;

        word = sb.toString();
        System.out.println(word);// DCBA

    }
}
