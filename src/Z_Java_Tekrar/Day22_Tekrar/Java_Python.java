package Z_Java_Tekrar.Day22_Tekrar;

import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {
      /*3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
        (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
                */

        String sentence = "I like java and javascript, python, python";

        String[] str =sentence.split(" ");
        System.out.println(Arrays.toString(str));

        int countjava=0;
        int countpython=0;


        for( String each : str) {
            if (each.contains("java")) {
                countjava++;
            }
            if (each.contains("python")) {
                countpython++;
            }

        }
        System.out.println(countjava);
        System.out.println(countpython);
        System.out.println(countjava==countpython);




    }
}
