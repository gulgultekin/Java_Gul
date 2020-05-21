package Replits;

public class Methods_189 {
    /*
    isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false
     */
    public static void main(String[] args) {
        System.out.println(isError("onr error one two"));
    }


    public static boolean isError(String line)
    {
        boolean result;

        if(line.startsWith("error")){
            result= true;
        }else{
            result= false;
        }

        return result;
    }
}
