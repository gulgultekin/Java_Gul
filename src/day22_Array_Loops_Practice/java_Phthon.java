package day22_Array_Loops_Practice;

public class java_Phthon {
    public static void main(String[] args) {
    /*3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
                */

    String sentence = "I like java and javascript";

    sentence= sentence.toLowerCase(); // case sensitivity icin uygulanabilir

    int countJava =0;
    int countPython =0;

    String[] words = sentence.split(" ");  // [I,like,java,and,javascript]

    for(String each: words){
        if(each.contains("java")){
            countJava++;
        }
        if(each.contains("python")){
            countPython++;
        }
    }
        System.out.println(countJava); //2

        System.out.println(countPython); //0

        System.out.println(countJava==countPython); // false







    }
}
