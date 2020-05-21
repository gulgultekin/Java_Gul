package Tasks;

public class Calisma13_CountString_Loop {
    public static void main(String[] args) {
        /*
        write a program that count how many time the word "book" is appeared in a string
        input: I love books, I have books, I need books
        output: 3
         */

        String sentence= "I love books, I have books, I need books, I buy books";
                   // index:     i   i+4
        int count=0;
        for(int i=0; i<sentence.length()-3;i++){
       //sentence.length()-3 dememizin sebebi (i,i+4) diyince outof range olacak
            if(sentence.substring(i,i+4).equals("book")){
                      //          0, 4
                     //           1, 5
                     //           2, 6
                     //        .......
                     //         50,  54
                count++;
            }
        }
        System.out.println(count);



        String str=" gul, aaa gul, guls,  gul  gulu";
        int sonuc=0;

        for(int i=0; i<str.length()-2; i++){

            if(str.substring(i,i+3).equals("gul")){
                sonuc++;
            }
        }
        System.out.println(sonuc);



        String s="cat cat cat catooo catooos cate";
        int sonuc1=0;

        for(int i=0; i<s.length()-2; i++){

            if(s.substring(i,i+3).equals("cat")){
                sonuc1+=1;
            }
        }
        System.out.println(sonuc1);


    }
}
