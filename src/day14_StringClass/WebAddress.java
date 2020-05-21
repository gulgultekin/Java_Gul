package day14_StringClass;

public class WebAddress {
    /*
        write a program that can validate if a web address is valid
        valid web address:
            MUST start with www.
            MUST ends with .com, or .edu, or .net or .gov
         */
    public static void main(String[] args) {

        String website = "WWw.amazon.Com";
        website= website.toLowerCase();

        boolean validEnding = website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".net")
                            ||website.endsWith(".Gov");

        if(website.startsWith("www.") && validEnding){
            System.out.println("Valid address");

        }else{
            System.out.println("invalid web address");
        }

    }
}