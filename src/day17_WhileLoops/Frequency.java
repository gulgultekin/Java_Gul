package day17_WhileLoops;

public class Frequency {

    public static void main(String[] args) {
        //how many times Java?

        String str= "Java is fun, Java is cool, Java, Java,java,JAVA".toLowerCase();

        int count = 0;//2

        String word ="Java".toLowerCase();

        while(str.contains(word)){
            count++;
            str=str.replaceFirst(word,"");//after counting the first "Java" , we need to remove it from string
        }
        System.out.println(count);



    }
}
