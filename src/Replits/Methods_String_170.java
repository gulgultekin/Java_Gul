package Replits;

public class Methods_String_170 {
    /*
    This method gets two strings (text and badWord)  and returns a string.

basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
     */
    public static void main(String[] args) {
        String text ="one two three";
        String badWord ="two";
        String result = clean(text,badWord);
        System.out.println(result);
    }


    public static String clean (String text ,String badWord) {
        String result ="";
       result = text.replace(badWord,"");
       return result;


    }
}
